package defpackage;

import com.google.android.apps.messaging.R;
import defpackage.cov;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blo {
    public static final arqv a = new cdj(984817901, false, AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: blo$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cov covVar = btc.a;
                if (covVar == null) {
                    cov.a aVar = new cov.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    List list = cpe.a;
                    cmd cmdVar = new cmd(cku.a);
                    cow cowVar = new cow();
                    cowVar.c();
                    cowVar.b(17.59f, 5.0f);
                    cowVar.b(12.0f, 10.59f);
                    cowVar.b(6.41f, 5.0f);
                    cowVar.b(5.0f, 6.41f);
                    cowVar.b(10.59f, 12.0f);
                    cowVar.b(5.0f, 17.59f);
                    cowVar.b(6.41f, 19.0f);
                    cowVar.b(12.0f, 13.41f);
                    cowVar.b(17.59f, 19.0f);
                    cowVar.b(19.0f, 17.59f);
                    cowVar.b(13.41f, 12.0f);
                    cowVar.a();
                    aVar.c(cowVar.a, 0, "", cmdVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, brg.a, 1.0f, brg.a);
                    btc.a = aVar.a();
                    covVar = btc.a;
                    covVar.getClass();
                }
                bmd.b(covVar, btp.a(R.string.m3c_snackbar_dismiss, bwjVar), null, 0L, bwjVar, 0, 12);
            }
            return arnb.a;
        }
    }
}
