package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclg extends abtp implements ackb {
    private final int c;

    public aclg(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    @Override // defpackage.ackb
    public final int a() {
        return gr();
    }

    @Override // defpackage.ackb
    public final ackc b() {
        return new aclj(this.a, this.b, this.c);
    }

    @Override // defpackage.abtp, defpackage.abtr
    public final /* synthetic */ Object d() {
        return new aclf(this);
    }

    public final String toString() {
        String str;
        if (gr() == 1) {
            str = "changed";
        } else if (gr() == 2) {
            str = "deleted";
        } else {
            str = "unknown";
        }
        return "DataEventRef{ type=" + str + ", dataitem=" + b().toString() + " }";
    }
}
