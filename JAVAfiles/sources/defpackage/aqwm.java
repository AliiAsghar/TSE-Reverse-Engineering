package defpackage;

import io.grpc.Status;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwm extends appn {
    public static final Logger a = Logger.getLogger(aqwm.class.getName());
    private static final Class g;
    private static final Class h;
    private static final atqq i;
    public final boolean b;
    public final albv c;
    public aqut d;
    public Map e;
    public final boolean f;

    static {
        atqq atqqVar;
        Class cls;
        ClassLoader classLoader = aqwm.class.getClassLoader();
        Class<?> cls2 = null;
        try {
            try {
                atqqVar = new atqq(Class.forName("alcf", false, classLoader), classLoader);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", e);
                atqqVar = null;
                i = atqqVar;
                cls = Class.forName("albz").asSubclass(albv.class);
                g = cls;
                cls2 = Class.forName("com.google.auth.appengine.AppEngineCredentials");
                h = cls2;
            }
        } catch (ClassNotFoundException unused) {
        }
        i = atqqVar;
        try {
            cls = Class.forName("albz").asSubclass(albv.class);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (Throwable) e2);
            cls = null;
        }
        g = cls;
        try {
            cls2 = Class.forName("com.google.auth.appengine.AppEngineCredentials");
        } catch (ClassNotFoundException e3) {
            a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", (Throwable) e3);
        }
        h = cls2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aqwm(defpackage.albv r12) {
        /*
            r11 = this;
            atqq r0 = defpackage.aqwm.i
            r1 = 0
            r11.<init>(r1, r1)
            java.lang.Class r2 = defpackage.aqwm.g
            r3 = 0
            if (r2 == 0) goto L10
            boolean r2 = r2.isInstance(r12)
            goto L11
        L10:
            r2 = r3
        L11:
            if (r0 == 0) goto L8e
            java.lang.Object r4 = r0.a
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r12)
            if (r4 != 0) goto L1f
            goto L8e
        L1f:
            java.lang.Object r4 = r0.a     // Catch: java.lang.reflect.InvocationTargetException -> L79 java.lang.IllegalAccessException -> L7c
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.reflect.InvocationTargetException -> L79 java.lang.IllegalAccessException -> L7c
            java.lang.Object r4 = r4.cast(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L79 java.lang.IllegalAccessException -> L7c
            albv r4 = (defpackage.albv) r4     // Catch: java.lang.reflect.InvocationTargetException -> L79 java.lang.IllegalAccessException -> L7c
            java.lang.Object r12 = r0.e     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r12 = r12.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            int r12 = r12.size()     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            if (r12 != 0) goto L75
            java.lang.Object r12 = r0.d     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r12 = r12.invoke(r1, r1)     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r5 = r0.b     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
        L47:
            boolean r6 = r5.hasNext()     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            asmb r6 = (defpackage.asmb) r6     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r7 = r6.b     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r6 = r6.a     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r6 = r6.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            r8[r3] = r6     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            r7.invoke(r12, r8)     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            goto L47
        L68:
            r12 = move-exception
            goto L7f
        L6a:
            java.lang.Object r0 = r0.c     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r12 = r0.invoke(r12, r1)     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            albv r12 = (defpackage.albv) r12     // Catch: java.lang.IllegalAccessException -> L68 java.lang.reflect.InvocationTargetException -> L77
            goto L8e
        L75:
            r12 = r4
            goto L8e
        L77:
            r12 = move-exception
            goto L7f
        L79:
            r0 = move-exception
            r10 = r0
            goto L81
        L7c:
            r0 = move-exception
            r4 = r12
            r12 = r0
        L7f:
            r10 = r12
            r12 = r4
        L81:
            java.util.logging.Logger r5 = defpackage.aqwm.a
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r8 = "tryServiceAccountToJwt"
            java.lang.String r9 = "Failed converting service account credential to JWT. This is unexpected"
            java.lang.String r7 = "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper"
            r5.logp(r6, r7, r8, r9, r10)
        L8e:
            r11.b = r2
            r11.c = r12
            java.lang.Class r0 = defpackage.aqwm.h
            if (r0 != 0) goto L99
            r11.f = r3
            return
        L99:
            boolean r12 = r0.isInstance(r12)
            r11.f = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqwm.<init>(albv):void");
    }

    public static void l(String str, aqux aquxVar) {
        try {
            URI uri = new URI("https", str, "/".concat(String.valueOf(aquxVar.c)), null, null);
            if (uri.getPort() == 443) {
                m(uri);
            }
        } catch (URISyntaxException e) {
            throw Status.i.withDescription("Unable to construct service URI for auth").d(e).asException();
        }
    }

    private static void m(URI uri) {
        try {
            new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw Status.i.withDescription("Unable to construct service URI after removing port").d(e).asException();
        }
    }
}
