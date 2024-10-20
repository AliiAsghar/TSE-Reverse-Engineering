package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.BufferedReader;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class armd {
    public static final arml a(arqg arqgVar) {
        arqgVar.getClass();
        return new arms(arqgVar);
    }

    public static final arml b(int i, arqg arqgVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return new arnc(arqgVar);
            }
            return new armr(arqgVar);
        }
        return new arms(arqgVar);
    }

    public static final void c(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (arqa.a != null && arqa.a.intValue() < 19) {
                Method method = arpz.a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }

    public static final Class d(artf artfVar) {
        artfVar.getClass();
        return ((arrg) artfVar).a();
    }

    public static final Class e(artf artfVar) {
        String name;
        artfVar.getClass();
        Class a = ((arrg) artfVar).a();
        if (a.isPrimitive() && (name = a.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    return a;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    return a;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    return a;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    return a;
                case 3327612:
                    if (name.equals(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG)) {
                        return Long.class;
                    }
                    return a;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    return a;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    return a;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    return a;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    return a;
                default:
                    return a;
            }
        }
        return a;
    }

    public static final artf f(Class cls) {
        cls.getClass();
        int i = arsc.a;
        return new arrh(cls);
    }

    public static final void g(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                c(th, th2);
            }
        }
    }

    public static final artx h(BufferedReader bufferedReader) {
        return arrn.c(new artp(bufferedReader, 1));
    }

    public static final void i(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                c(th, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(defpackage.asai r5, defpackage.asaj r6, defpackage.arpe r7) {
        /*
            boolean r0 = r7 instanceof defpackage.asaw
            if (r0 == 0) goto L13
            r0 = r7
            asaw r0 = (defpackage.asaw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            asaw r0 = new asaw
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            arsb r5 = r0.c
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r7)
            arsb r7 = new arsb
            r7.<init>()
            zdd r2 = new zdd     // Catch: java.lang.Throwable -> L4f
            r4 = 14
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4f
            r0.c = r7     // Catch: java.lang.Throwable -> L4f
            r0.b = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r5 = 0
            return r5
        L4f:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L52:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r7 = y(r6, r5)
            if (r7 != 0) goto L8a
            arpi r7 = r0.u()
            akty r0 = defpackage.arxm.c
            arpg r7 = r7.get(r0)
            arxm r7 = (defpackage.arxm) r7
            if (r7 == 0) goto L7b
            boolean r0 = r7.y()
            if (r0 != 0) goto L71
            goto L7b
        L71:
            java.util.concurrent.CancellationException r7 = r7.r()
            boolean r7 = y(r6, r7)
            if (r7 != 0) goto L8a
        L7b:
            if (r5 != 0) goto L7e
            return r6
        L7e:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L86
            c(r5, r6)
            throw r5
        L86:
            c(r6, r5)
            throw r6
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.armd.j(asai, asaj, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(defpackage.asaj r4, defpackage.arqw r5, java.lang.Throwable r6, defpackage.arpe r7) {
        /*
            boolean r0 = r7 instanceof defpackage.asas
            if (r0 == 0) goto L13
            r0 = r7
            asas r0 = (defpackage.asas) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asas r0 = new asas
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.aqil.P(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.a(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            arnb r4 = defpackage.arnb.a
            return r4
        L44:
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            c(r4, r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.armd.k(asaj, arqw, java.lang.Throwable, arpe):java.lang.Object");
    }

    public static final void l(asaj asajVar) {
        if (!(asajVar instanceof asde)) {
        } else {
            throw ((asde) asajVar).a;
        }
    }

    public static final asai m(asai asaiVar) {
        return u(asaiVar, -1);
    }

    public static final asai n(asai asaiVar, arpi arpiVar) {
        if (arpiVar.get(arxm.c) == null) {
            if (!d.F(arpiVar, arpj.a)) {
                if (asaiVar instanceof asdv) {
                    return arro.J((asdv) asaiVar, arpiVar, 0, 0, 6);
                }
                return new asdl(asaiVar, arpiVar, 0, 0, 12);
            }
            return asaiVar;
        }
        Objects.toString(arpiVar);
        throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(arpiVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(defpackage.asai r4, java.util.Collection r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.asan
            if (r0 == 0) goto L13
            r0 = r6
            asan r0 = (defpackage.asan) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asan r0 = new asan
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.aqil.P(r6)
            agco r6 = new agco
            r2 = 11
            r6.<init>(r5, r2)
            r0.a = r5
            r0.c = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.armd.o(asai, java.util.Collection, arpe):java.lang.Object");
    }

    public static final Object p(asai asaiVar, arpe arpeVar) {
        Object a = asaiVar.a(asdx.a, arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    public static final Object q(asai asaiVar, arqv arqvVar, arpe arpeVar) {
        Object p = p(u(asbm.b(asaiVar, arqvVar), 0), arpeVar);
        if (p == arpl.a) {
            return p;
        }
        return arnb.a;
    }

    public static final Object r(asaj asajVar, asai asaiVar, arpe arpeVar) {
        l(asajVar);
        Object a = asaiVar.a(asajVar, arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0058, B:20:0x006d, B:22:0x0075, B:34:0x0046, B:37:0x0054), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:14:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(defpackage.asaj r6, defpackage.arzw r7, boolean r8, defpackage.arpe r9) {
        /*
            boolean r0 = r9 instanceof defpackage.asam
            if (r0 == 0) goto L13
            r0 = r9
            asam r0 = (defpackage.asam) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            asam r0 = new asam
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.c
            aryz r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L34
            r9 = r6
            r6 = r2
            goto L58
        L34:
            r6 = move-exception
            goto L96
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.c
            aryz r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L34
            r5 = r0
            r0 = r6
            r6 = r2
        L4c:
            r2 = r5
            goto L6d
        L4e:
            defpackage.aqil.P(r9)
            l(r6)
            aryz r9 = r7.B()     // Catch: java.lang.Throwable -> L34
        L58:
            r0.a = r6     // Catch: java.lang.Throwable -> L34
            r0.b = r7     // Catch: java.lang.Throwable -> L34
            r0.f = r9     // Catch: java.lang.Throwable -> L34
            r0.c = r8     // Catch: java.lang.Throwable -> L34
            r0.e = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r0
            r0 = r9
            r9 = r2
            goto L4c
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r0.b()     // Catch: java.lang.Throwable -> L34
            r2.a = r6     // Catch: java.lang.Throwable -> L34
            r2.b = r7     // Catch: java.lang.Throwable -> L34
            r2.f = r0     // Catch: java.lang.Throwable -> L34
            r2.c = r8     // Catch: java.lang.Throwable -> L34
            r2.e = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r6.fv(r9, r2)     // Catch: java.lang.Throwable -> L34
            if (r9 == r1) goto L8c
            r9 = r0
            r0 = r2
            goto L58
        L8c:
            return r1
        L8d:
            if (r8 == 0) goto L93
            r6 = 0
            defpackage.arhi.r(r7, r6)
        L93:
            arnb r6 = defpackage.arnb.a
            return r6
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r9 = move-exception
            if (r8 != 0) goto L9b
            goto L9e
        L9b:
            defpackage.arhi.r(r7, r6)
        L9e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.armd.s(asaj, arzw, boolean, arpe):java.lang.Object");
    }

    public static final arzw t(asai asaiVar, arwe arweVar) {
        asdj asdjVar;
        if (asaiVar instanceof asdj) {
            asdjVar = (asdj) asaiVar;
        } else {
            asdjVar = null;
        }
        if (asdjVar == null) {
            asdjVar = new asdl(asaiVar, null, 0, 0, 14);
        }
        return asdjVar.e(arweVar);
    }

    public static /* synthetic */ asai u(asai asaiVar, int i) {
        int i2;
        if (i < 0 && i != -2) {
            i = -1;
        }
        if (i == -1) {
            i = -1;
        }
        if (i == -1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (i == -1) {
            i = 0;
        }
        int i3 = i;
        if (asaiVar instanceof asdv) {
            return arro.J((asdv) asaiVar, null, i3, i2, 1);
        }
        return new asdl(asaiVar, null, i3, i2, 2);
    }

    public static /* synthetic */ void w(arzx arzxVar) {
        arzxVar.e(null);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.lang.Object] */
    public static final void x(String str, String str2, atoi atoiVar) {
        if (!str.isEmpty()) {
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 != null) {
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    char charAt2 = str2.charAt(i3);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                    }
                }
                while (i < atoiVar.a.size()) {
                    if (str.equalsIgnoreCase((String) atoiVar.a.get(i))) {
                        atoiVar.a.remove(i);
                        atoiVar.a.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                atoiVar.a.add(str);
                atoiVar.a.add(str2.trim());
                return;
            }
            throw new IllegalArgumentException("value == null");
        }
        throw new IllegalArgumentException("name is empty");
    }

    private static final boolean y(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (arwh.b) {
                th2 = asfm.c(th2);
            }
            if (arwh.b) {
                th = asfm.c(th);
            }
            if (d.F(th2, th)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
