package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import defpackage.dkx;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dky implements dmc {
    private final Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dky$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        /* synthetic */ Object b;
        int d;
        dky e;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return dky.this.a(null, this);
        }
    }

    public dky(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ed A[PHI: r14
  0x00ed: PHI (r14v23 java.lang.Object) = (r14v20 java.lang.Object), (r14v1 java.lang.Object) binds: [B:35:0x00ea, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.dlh r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dky.a(dlh, arpe):java.lang.Object");
    }

    @Override // defpackage.dmc
    public final /* bridge */ /* synthetic */ Object b(dlh dlhVar) {
        Object O;
        Typeface typeface;
        if (!(dlhVar instanceof dkx)) {
            Object obj = null;
            if (!(dlhVar instanceof dmi)) {
                return null;
            }
            int a = dlhVar.a();
            if (a.bA(a, 0)) {
                typeface = dla.a((dmi) dlhVar, this.a);
            } else if (a.bA(a, 1)) {
                try {
                    O = dla.a((dmi) dlhVar, this.a);
                } catch (Throwable th) {
                    O = aqil.O(th);
                }
                if (true != (O instanceof armp)) {
                    obj = O;
                }
                typeface = (Typeface) obj;
            } else {
                if (a.bA(a, 2)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                String a2 = dlr.a(dlhVar.a());
                Objects.toString(a2);
                throw new IllegalArgumentException("Unknown loading type ".concat(a2));
            }
            return dmh.a(typeface, ((dmi) dlhVar).b, this.a);
        }
        dkx dkxVar = (dkx) dlhVar;
        dkx.a aVar = dkxVar.a;
        Objects.toString(dkxVar);
        throw new IllegalStateException("GoogleFont only support async loading: ".concat(String.valueOf(dkxVar)));
    }
}
