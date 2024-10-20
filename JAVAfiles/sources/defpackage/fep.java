package defpackage;

import android.os.HandlerThread;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fep implements alhr {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ fep(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        agnw d;
        agnw d2;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                int i2 = 3;
                if (i != 2) {
                    if (i != 3) {
                        return uvl.g("bug_" + this.a);
                    }
                    int i3 = qwd.a;
                    qvd a = qvk.a();
                    a.g(new qwe(UUID.randomUUID()));
                    a.d(qvn.a);
                    qvc b = a.b(new qqe(14));
                    b.h();
                    qwe d3 = b.d();
                    d3.getClass();
                    std e = qww.e();
                    int i4 = this.a;
                    e.j(i4);
                    e.i("unknown_iccid");
                    e.g(d3);
                    e.f().k(new qqv(i4, i2));
                    return d3;
                }
                int i5 = qrk.a;
                tcl tclVar = new tcl();
                tclVar.f("guessPhoneNumberCompareMinMatchValueSync");
                tclVar.e();
                tclVar.d();
                int i6 = this.a;
                StringBuilder sb = new StringBuilder(i6);
                sb.append('4');
                for (int i7 = 1; i7 < i6; i7++) {
                    String sb2 = sb.toString();
                    int i8 = taq.a;
                    tch tchVar = new tch();
                    tchVar.b(sb2);
                    tcg a2 = tchVar.a();
                    d = agnc.d("$primary");
                    d2 = agnc.d("$primary");
                    agnc.a(d2, "phone_number_min_match_guesser", a2, new tbe(d, 5), new smq(a2, 19));
                    sb.append('4');
                    String sb3 = sb.toString();
                    tcp tcpVar = new tcp();
                    tcpVar.W(new agpk("PHONE_NUMBERS_EQUAL($V, $V, $V)", new Object[]{tcq.c.a, sb3, 0}));
                    agpw agpwVar = new agpw(tcpVar);
                    tco tcoVar = new tco(tcq.a);
                    tcoVar.w("guessPhoneNumberCompareMinMatchValueSync");
                    tcoVar.k(agpwVar);
                    if (tcoVar.b().i() > 0) {
                        return Optional.of(Integer.valueOf(i7));
                    }
                }
                return Optional.empty();
            }
            return new HandlerThread(fer.d(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
        return new HandlerThread(fer.d(this.a, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
