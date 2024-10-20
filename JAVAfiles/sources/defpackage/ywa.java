package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywa implements rtn {
    public final ackf a = new ackf();

    static {
        alwo.o("BugleWearable");
    }

    @Override // defpackage.rtn
    public final String N() {
        return yyb.h(this.a, "24");
    }

    @Override // defpackage.rtn
    public final String Q(Context context) {
        return yyb.h(this.a, "12");
    }

    public final void a(String str) {
        this.a.n("24", str);
    }

    @Override // defpackage.rtn
    public final boolean au() {
        int p = this.a.p("11");
        if (p >= 100 && p <= 115) {
            return true;
        }
        return false;
    }

    public final void b(String str) {
        this.a.n("12", str);
    }

    @Override // defpackage.rtn
    public final int c() {
        return this.a.p("36");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ywa) {
            return this.a.equals(((ywa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.rtn
    public final long n() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rtn
    public final ConversationIdType t() {
        return ruy.b(yyb.g(this.a, "1"));
    }
}
