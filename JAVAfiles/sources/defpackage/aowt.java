package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.nio.ByteBuffer;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aowt {
    public static volatile aqux a;
    public static volatile aqux b;
    public static volatile aqux c;
    public static volatile aqux d;
    private static Thread e;

    private aowt() {
    }

    public static final aozb a(aozl aozlVar, byte[] bArr) {
        aozlVar.ah();
        return new aoyz(bArr);
    }

    public static apbt b(Parcel parcel, apbt apbtVar, aozs aozsVar) {
        return r((ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR), apbtVar, aozsVar);
    }

    public static apbt c(Intent intent, String str, apbt apbtVar, aozs aozsVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (parcelableExtra instanceof Bundle) {
            Bundle bundle = (Bundle) parcelableExtra;
            bundle.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
        }
        return r(protoParsers$InternalDontUse, apbtVar, aozsVar);
    }

    public static apbt d(Bundle bundle, String str, apbt apbtVar, aozs aozsVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return r(protoParsers$InternalDontUse, apbtVar, aozsVar);
    }

    public static apbt e(Parcel parcel, apbt apbtVar, aozs aozsVar) {
        try {
            return b(parcel, apbtVar, aozsVar);
        } catch (apba e2) {
            throw new RuntimeException(e2);
        }
    }

    public static apbt f(Bundle bundle, String str, apbt apbtVar, aozs aozsVar) {
        try {
            return d(bundle, str, apbtVar, aozsVar);
        } catch (apba e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g(Parcel parcel, apbt apbtVar) {
        parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, apbtVar), 0);
    }

    public static void h(Intent intent, String str, apbt apbtVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, apbtVar));
        intent.putExtra(str, bundle);
    }

    public static void i(Bundle bundle, String str, apbt apbtVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, apbtVar));
        bundle.putParcelable(str, bundle2);
    }

    public static final String j(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                byte b2 = byteBuffer.get(i);
                if (!aovp.h(b2)) {
                    break;
                }
                i++;
                aovp.e(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i < i4) {
                int i7 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (aovp.h(b3)) {
                    aovp.e(b3, cArr, i6);
                    i6++;
                    i = i7;
                    while (i < i4) {
                        byte b4 = byteBuffer.get(i);
                        if (aovp.h(b4)) {
                            i++;
                            aovp.e(b4, cArr, i6);
                            i6++;
                        }
                    }
                } else {
                    if (aovp.j(b3)) {
                        if (i7 < i4) {
                            i3 = i6 + 1;
                            i += 2;
                            aovp.g(b3, byteBuffer.get(i7), cArr, i6);
                        } else {
                            throw new apba("Protocol message had invalid UTF-8.");
                        }
                    } else if (aovp.i(b3)) {
                        if (i7 < i4 - 1) {
                            i3 = i6 + 1;
                            int i8 = i + 2;
                            i += 3;
                            aovp.f(b3, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                        } else {
                            throw new apba("Protocol message had invalid UTF-8.");
                        }
                    } else if (i7 < i4 - 2) {
                        byte b5 = byteBuffer.get(i7);
                        int i9 = i + 3;
                        byte b6 = byteBuffer.get(i + 2);
                        i += 4;
                        aovp.d(b3, b5, b6, byteBuffer.get(i9), cArr, i6);
                        i6 += 2;
                    } else {
                        throw new apba("Protocol message had invalid UTF-8.");
                    }
                    i6 = i3;
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static String k(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                byte b2 = bArr[i];
                if (!aovp.h(b2)) {
                    break;
                }
                i++;
                aovp.e(b2, cArr, i5);
                i5++;
            }
            while (i < i4) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (aovp.h(b3)) {
                    aovp.e(b3, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i4) {
                        byte b4 = bArr[i];
                        if (aovp.h(b4)) {
                            i++;
                            aovp.e(b4, cArr, i5);
                            i5++;
                        }
                    }
                } else {
                    if (aovp.j(b3)) {
                        if (i6 < i4) {
                            i3 = i5 + 1;
                            i += 2;
                            aovp.g(b3, bArr[i6], cArr, i5);
                        } else {
                            throw new apba("Protocol message had invalid UTF-8.");
                        }
                    } else if (aovp.i(b3)) {
                        if (i6 < i4 - 1) {
                            i3 = i5 + 1;
                            int i7 = i + 2;
                            i += 3;
                            aovp.f(b3, bArr[i6], bArr[i7], cArr, i5);
                        } else {
                            throw new apba("Protocol message had invalid UTF-8.");
                        }
                    } else if (i6 < i4 - 2) {
                        byte b5 = bArr[i6];
                        int i8 = i + 3;
                        byte b6 = bArr[i + 2];
                        i += 4;
                        aovp.d(b3, b5, b6, bArr[i8], cArr, i5);
                        i5 += 2;
                    } else {
                        throw new apba("Protocol message had invalid UTF-8.");
                    }
                    i5 = i3;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int l(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aowt.l(int, byte[], int, int):int");
    }

    public static eov m(re reVar, eov eovVar) {
        return ((apwx) aovp.m(reVar, apwx.class)).S().q(eovVar);
    }

    public static eov n(cg cgVar, eov eovVar) {
        return ((apwy) aovp.m(cgVar, apwy.class)).x().q(eovVar);
    }

    public static void o() {
        if (e == null) {
            e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == e) {
        } else {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static Application p(Context context) {
        if (!(context instanceof Application)) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    return (Application) context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(context))));
        }
        return (Application) context;
    }

    public static boolean q(Context context) {
        boolean z;
        Set Lt = ((apww) aovp.l(context, apww.class)).Lt();
        altg altgVar = (altg) Lt;
        if (altgVar.e <= 1) {
            z = true;
        } else {
            z = false;
        }
        apzj.g(z, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (Lt.isEmpty()) {
            return true;
        }
        return ((Boolean) altgVar.listIterator().next()).booleanValue();
    }

    private static apbt r(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, apbt apbtVar, aozs aozsVar) {
        return protoParsers$InternalDontUse.b(apbtVar.getDefaultInstanceForType(), aozsVar);
    }
}
