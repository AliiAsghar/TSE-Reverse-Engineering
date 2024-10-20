package defpackage;

import android.content.Context;
import java.lang.annotation.Annotation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aovp {
    public static int a(String str, int i) {
        while (i < str.length() && str.charAt(i) != '-') {
            i++;
        }
        return i;
    }

    public static int b(aoyc aoycVar) {
        return aoycVar.c - aoycVar.b;
    }

    public static String c(String str, aoyc aoycVar) {
        int i = aoycVar.a;
        return str.substring(aoycVar.b + i, i + aoycVar.c);
    }

    public static void d(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!q(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !q(b3) && !q(b4)) {
            int p = ((b & 7) << 18) | (p(b2) << 12) | (p(b3) << 6) | p(b4);
            cArr[i] = (char) ((p >>> 10) + 55232);
            cArr[i + 1] = (char) ((p & 1023) + 56320);
            return;
        }
        throw new apba("Protocol message had invalid UTF-8.");
    }

    public static void e(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static void f(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!q(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!q(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | (p(b2) << 6) | p(b3));
                return;
            }
        }
        throw new apba("Protocol message had invalid UTF-8.");
    }

    public static void g(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !q(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | p(b2));
            return;
        }
        throw new apba("Protocol message had invalid UTF-8.");
    }

    public static boolean h(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    public static boolean i(byte b) {
        if (b < -16) {
            return true;
        }
        return false;
    }

    public static boolean j(byte b) {
        if (b < -32) {
            return true;
        }
        return false;
    }

    public static String k(aozb aozbVar) {
        StringBuilder sb = new StringBuilder(aozbVar.d());
        for (int i = 0; i < aozbVar.d(); i++) {
            byte a = aozbVar.a(i);
            if (a != 34) {
                if (a != 39) {
                    if (a != 92) {
                        switch (a) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (a >= 32 && a <= 126) {
                                    sb.append((char) a);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a >>> 6) & 3) + 48));
                                    sb.append((char) (((a >>> 3) & 7) + 48));
                                    sb.append((char) ((a & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static Object l(Context context, Class cls) {
        context.getClass();
        return m(aowt.p(context.getApplicationContext()), cls);
    }

    public static Object m(Object obj, Class cls) {
        boolean z;
        if (obj instanceof apxp) {
            if (obj instanceof apxs) {
                Annotation[] annotations = cls.getAnnotations();
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
                apzj.g(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        }
        if (obj instanceof apxq) {
            return m(((apxq) obj).aS(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), apxp.class, apxq.class));
    }

    public static /* synthetic */ apwq n(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (apwq) s;
    }

    public static void o() {
        algw a = algw.h(null).a(new akdg(20));
        if (a.f()) {
            if (albo.ar((CharSequence) a.b(), "md5") || albo.ar((CharSequence) a.b(), "sha-1")) {
                albo.ar((CharSequence) a.b(), "md5");
                amcn amcnVar = amcn.e;
                throw null;
            }
        }
    }

    private static int p(byte b) {
        return b & 63;
    }

    private static boolean q(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
