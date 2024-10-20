package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class appn {
    public appn(byte[] bArr) {
    }

    public static /* synthetic */ aplp a(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aplp) s;
    }

    public static void b(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aplp aplpVar = (aplp) aozyVar.b;
        aplp aplpVar2 = aplp.a;
        aplpVar.b |= 64;
        aplpVar.i = z;
    }

    public static void c(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aplp aplpVar = (aplp) aozyVar.b;
        aplp aplpVar2 = aplp.a;
        aplpVar.b |= 16;
        aplpVar.g = i;
    }

    public static void d(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aplp aplpVar = (aplp) aozyVar.b;
        aplp aplpVar2 = aplp.a;
        aplpVar.b |= 32;
        aplpVar.h = i;
    }

    public static void e(aplo aploVar, aozy aozyVar) {
        aploVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aplp aplpVar = (aplp) aozyVar.b;
        aplp aplpVar2 = aplp.a;
        aplpVar.c = aploVar.f;
        aplpVar.b |= 1;
    }

    public static void f(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aplp aplpVar = (aplp) aozyVar.b;
        aplp aplpVar2 = aplp.a;
        aplpVar.b |= 128;
        aplpVar.j = z;
    }

    public static void g(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aplp aplpVar = (aplp) aozyVar.b;
        aplp aplpVar2 = aplp.a;
        aplpVar.b |= 256;
        aplpVar.k = z;
    }

    public static void h(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aplp aplpVar = (aplp) aozyVar.b;
        aplp aplpVar2 = aplp.a;
        aplpVar.b |= 512;
        aplpVar.l = i;
    }

    public static String i(int i) {
        return Integer.toString(a.M(i));
    }

    public static int j(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return 30;
            default:
                return 0;
        }
    }

    public static /* synthetic */ Object k(Object obj) {
        return (asja) apag.parseFrom(asja.a, (byte[]) obj);
    }

    public appn(byte[] bArr, byte[] bArr2) {
    }

    public appn() {
        new CopyOnWriteArraySet();
    }
}
