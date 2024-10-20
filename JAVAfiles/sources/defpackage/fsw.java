package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsw implements frl {
    private final euf a = new euf();

    @Override // defpackage.frl
    public final /* synthetic */ frc a(byte[] bArr, int i, int i2) {
        return fsm.b(this, bArr, i2);
    }

    @Override // defpackage.frl
    public final void b(byte[] bArr, int i, int i2, frk frkVar, etm etmVar) {
        boolean z;
        esz a;
        boolean z2;
        this.a.H(bArr, i2 + i);
        this.a.J(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            euf eufVar = this.a;
            if (eufVar.b() > 0) {
                if (eufVar.b() >= 8) {
                    z = true;
                } else {
                    z = false;
                }
                d.t(z, "Incomplete Mp4Webvtt Top Level box header found.");
                int e = this.a.e() - 8;
                if (this.a.e() == 1987343459) {
                    euf eufVar2 = this.a;
                    CharSequence charSequence = null;
                    esy esyVar = null;
                    while (e > 0) {
                        if (e >= 8) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        d.t(z2, "Incomplete vtt cue box header found.");
                        int e2 = eufVar2.e();
                        int e3 = eufVar2.e();
                        int i3 = e - 8;
                        int i4 = e2 - 8;
                        String I = eul.I(eufVar2.a, eufVar2.b, i4);
                        eufVar2.K(i4);
                        if (e3 == 1937011815) {
                            ftb ftbVar = new ftb();
                            ftc.b(I, ftbVar);
                            esyVar = ftbVar.a();
                        } else if (e3 == 1885436268) {
                            charSequence = ftc.a(null, I.trim(), Collections.emptyList());
                        }
                        e = i3 - i4;
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (esyVar != null) {
                        esyVar.a = charSequence;
                        a = esyVar.a();
                    } else {
                        ftb ftbVar2 = new ftb();
                        ftbVar2.c = charSequence;
                        a = ftbVar2.a().a();
                    }
                    arrayList.add(a);
                } else {
                    this.a.K(e);
                }
            } else {
                etmVar.a(new xab(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    @Override // defpackage.frl
    public final /* synthetic */ void c() {
    }
}
