package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asad extends asdj {
    private final arzw d;
    private final arvb e;

    public asad(arzw arzwVar, arpi arpiVar, int i, int i2) {
        super(arpiVar, i, i2);
        this.d = arzwVar;
        this.e = new arvb(false, arvf.a);
    }

    private final void g() {
        if (arvb.a.getAndSet(this.e, 1) != 1) {
        } else {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // defpackage.asdj, defpackage.asai
    public final Object a(asaj asajVar, arpe arpeVar) {
        if (this.b == -3) {
            g();
            Object s = armd.s(asajVar, this.d, true, arpeVar);
            if (s == arpl.a) {
                return s;
            }
        } else {
            Object h = asdj.h(this, asajVar, arpeVar);
            if (h == arpl.a) {
                return h;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.asdj
    public final Object b(arzu arzuVar, arpe arpeVar) {
        Object s = armd.s(new asec(arzuVar), this.d, true, arpeVar);
        if (s == arpl.a) {
            return s;
        }
        return arnb.a;
    }

    @Override // defpackage.asdj
    protected final asdj c(arpi arpiVar, int i, int i2) {
        return new asad(this.d, arpiVar, i, i2);
    }

    @Override // defpackage.asdj
    protected final String d() {
        arzw arzwVar = this.d;
        Objects.toString(arzwVar);
        return "channel=".concat(arzwVar.toString());
    }

    @Override // defpackage.asdj
    public final arzw e(arwe arweVar) {
        g();
        if (this.b == -3) {
            return this.d;
        }
        return super.e(arweVar);
    }

    @Override // defpackage.asdj
    public final asai f() {
        return new asad(this.d);
    }

    public /* synthetic */ asad(arzw arzwVar) {
        this(arzwVar, arpj.a, -3, 1);
    }
}
