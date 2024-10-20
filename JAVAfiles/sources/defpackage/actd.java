package defpackage;

import java.security.Principal;
import org.apache.http.auth.Credentials;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class actd implements Credentials {
    @Override // org.apache.http.auth.Credentials
    public abstract String getPassword();

    @Override // org.apache.http.auth.Credentials
    public abstract Principal getUserPrincipal();
}
