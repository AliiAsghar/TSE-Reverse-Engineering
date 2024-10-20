package defpackage;

import com.google.android.gms.wearable.Channel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackr implements acjv {
    private final ahjj a;

    public ackr(ahjj ahjjVar) {
        this.a = ahjjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((ackr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.acjv
    public final void m(Channel channel) {
        abrc.q(channel);
        ((acko) this.a.a).i(channel);
    }

    @Override // defpackage.acjv
    public final void n(Channel channel) {
        abrc.q(channel);
    }

    @Override // defpackage.acjv
    public final void o(Channel channel) {
        abrc.q(channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.acjv
    public final void p(Channel channel) {
        abrc.q(channel);
        ((acko) this.a.a).k(channel);
    }
}
