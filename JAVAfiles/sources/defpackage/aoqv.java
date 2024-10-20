package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqv extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        char c;
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        aoroVar.m();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (aoroVar.t() != 4) {
            String h = aoroVar.h();
            int c2 = aoroVar.c();
            switch (h.hashCode()) {
                case -1181204563:
                    if (h.equals("dayOfMonth")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1074026988:
                    if (h.equals("minute")) {
                        c = 4;
                        break;
                    }
                    break;
                case -906279820:
                    if (h.equals("second")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3704893:
                    if (h.equals("year")) {
                        c = 0;
                        break;
                    }
                    break;
                case 104080000:
                    if (h.equals("month")) {
                        c = 1;
                        break;
                    }
                    break;
                case 985252545:
                    if (h.equals("hourOfDay")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            c = 65535;
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5) {
                                    i6 = c2;
                                }
                            } else {
                                i5 = c2;
                            }
                        } else {
                            i4 = c2;
                        }
                    } else {
                        i3 = c2;
                    }
                } else {
                    i2 = c2;
                }
            } else {
                i = c2;
            }
        }
        aoroVar.o();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        if (((Calendar) obj) == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        aorpVar.i("year");
        aorpVar.k(r4.get(1));
        aorpVar.i("month");
        aorpVar.k(r4.get(2));
        aorpVar.i("dayOfMonth");
        aorpVar.k(r4.get(5));
        aorpVar.i("hourOfDay");
        aorpVar.k(r4.get(11));
        aorpVar.i("minute");
        aorpVar.k(r4.get(12));
        aorpVar.i("second");
        aorpVar.k(r4.get(13));
        aorpVar.h();
    }
}
