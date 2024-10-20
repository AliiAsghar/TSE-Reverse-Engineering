package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwa implements aijy {
    private static final Set a = alpt.v("ACK", "BYE", "INVITE", "OPTIONS", "REGISTER", "SUBSCRIBE", new String[0]);
    private final armf b;

    public adwa(armf armfVar) {
        this.b = armfVar;
    }

    private static final String b(aiom aiomVar) {
        return albo.ag(aiomVar.a.i());
    }

    @Override // defpackage.aijy
    public final void a(aiom aiomVar) {
        int i;
        aila ailaVar = new aila();
        ailx b = aiomVar.b();
        String b2 = b(aiomVar);
        if (aiomVar.a.t()) {
            i = ((aioo) aiomVar).y();
        } else {
            i = -1;
        }
        if (a.contains(b2)) {
            if (aiomVar.a.s() || i == 200) {
                if (b != null) {
                    ailaVar = b.e;
                }
                boolean z = false;
                if (aiomVar.a.s() && b(aiomVar).equals("REGISTER")) {
                    z = true;
                }
                adfp b3 = ((adfq) this.b).b();
                Optional optional = b3.a;
                String str = b3.b;
                apfs apfsVar = b3.c;
                ailh ailhVar = b3.d;
                int i2 = b3.e;
                String str2 = b3.f;
                String str3 = apfsVar.c;
                String str4 = ailhVar.d;
                try {
                    advp advpVar = adwf.a;
                    aiomVar.u(new ailx(ahji.l((String) optional.orElse(null), z, str, str3), str4, i2, Optional.of(str2), ailaVar));
                    aikz a2 = ailaVar.a("mobility");
                    if (a2 == null) {
                        aikz aikzVar = new aikz("mobility", "mobile");
                        aikzVar.b();
                        ailaVar.e(aikzVar);
                        return;
                    }
                    a2.e = "mobile";
                } catch (ailb e) {
                    throw new IllegalArgumentException("ContactHeader could not be created", e);
                }
            }
        }
    }
}
