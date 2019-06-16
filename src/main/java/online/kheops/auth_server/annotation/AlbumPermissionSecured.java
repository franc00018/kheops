package online.kheops.auth_server.annotation;

import online.kheops.auth_server.user.AlbumUserPermissions;

import javax.ws.rs.NameBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@NameBinding
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface AlbumPermissionSecured {
    AlbumUserPermissions value();
}
