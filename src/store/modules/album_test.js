import { HTTP } from '@/router/http'
import httpoperations from '@/mixins/httpoperations'
// initial state
const state = {
	album: {},
	users: []
}

// getters
const getters = {
	albumTest: state => state.album,
	albumUsers: state => state.users
}

// actions
const actions = {
	getAlbum ({ commit }, params) {
		const request = `albums/${params.album_id}`
		return HTTP.get(request, { headers: { 'Accept': 'application/json' } }).then(res => {
			commit('SET_ALBUM_TEST', res.data)
			return res
		}).catch(err => {
			return err
		})
	},
	createAlbum ({ commit, dispatch }, params) {
		const request = `albums`
		let formData = ''
		if (params.formData !== undefined) {
			formData = httpoperations.getFormData(params.formData)
		}
		return HTTP.post(request, formData, { headers: { 'Accept': 'application/json', 'Content-Type': 'application/x-www-form-urlencoded' } }).then(res => {
			if (res.status === 201) {
				commit('SET_ALBUM_TEST', res.data)
			}
			return res
		}).catch(err => {
			return err
		})
	},
	removeStudyInAlbum ({ commit }, params) {
		const request = `studies/${params.StudyInstanceUID}/albums/${params.album_id}`
		return HTTP.delete(request).then(res => {
			if (res.status === 204) {
				commit('DELETE_STUDY_TEST', params)
			}
			return res
		}).catch(err => {
			return err
		})
	},
	removeSerieInAlbum ({ commit }, params) {
		const request = `studies/${params.StudyInstanceUID}/series/${params.SeriesInstanceUID}/albums/${params.album_id}`
		return HTTP.delete(request).then(res => {
			if (res.status === 204) {
				commit('DELETE_SERIE_TEST', params)
			}
			return res
		}).catch(err => {
			return err
		})
	},
	getUsersAlbum ({ commit }, params) {
		const request = `albums/${params.album_id}/users`
		return HTTP.get(request, '', { headers: { 'Accept': 'application/json' } }).then(res => {
			if (res.status === 200) {
				commit('SET_ALBUM_USERS', res.data)
			}
		})
	},
	editAlbum ({ commit }, params) {
		const request = `albums/${params.album_id}`
		let queries = ''
		if (params.queries !== undefined) {
			queries = httpoperations.getQueriesParameters(params.queries)
		}
		return HTTP.patch(request + queries, '', { headers: { 'Accept': 'application/json' } }).then(res => {
			if (res.status === 200) {
				commit('SET_ALBUM_TEST', res.data)
			}
			return res
		}).catch(err => {
			return err
		})
	},
	deleteAlbumTest ({ commit }, params) {
		const request = `albums/${params.album_id}`
		return HTTP.delete(request).then(res => {
			if (res.status === 204) {
				commit('INIT_ALBUM')
				commit('INIT_ALBUM_USERS')
			}
		})
	},
	addAlbumUser ({ dispatch }, params) {
		const request = `albums/${params.album_id}/users/${params.user}`
		return HTTP.put(request).then(res => {
			if (res.status === 201) {
				dispatch('getUsersAlbum', { album_id: params.album_id })
			}
			return res
		}).catch(err => {
			return err
		})
	},
	removeAlbumUser ({ dispatch }, params) {
		const request = `albums/${params.album_id}/users/${params.user}`
		return HTTP.delete(request).then(res => {
			if (res.status === 204) {
				dispatch('getUsersAlbum', { album_id: params.album_id })
			}
			return res
		}).catch(err => {
			return err
		})
	},
	manageAlbumUserAdmin ({ dispatch }, params) {
		const request = `albums/${params.album_id}/users/${params.user_name}/admin`
		let method = (params.user_is_admin) ? 'put' : 'delete'
		return HTTP[method](request).then(res => {
			if (res.status === 204) {
				dispatch('getUsersAlbum', { album_id: params.album_id })
			}
			return res
		}).catch(err => {
			return err
		})
	}
}

// mutations
const mutations = {
	INIT_ALBUM (state) {
		state.album = {}
	},
	SET_ALBUM_TEST (state, album) {
		state.album = album
	},
	INIT_ALBUM_USERS (state) {
		state.users = []
	},
	SET_ALBUM_USERS (state, users) {
		state.users = users
	}
}

export default {
	state,
	getters,
	actions,
	mutations
}
