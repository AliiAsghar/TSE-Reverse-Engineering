package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxl {
    public Boolean a;
    public Boolean b;
    public ypi c;
    public ConversationIdType d;
    public String e;
    public boolean f;
    public amfe g;
    public byte h;
    public int i;
    private int j;
    private int k;

    public final xxm a() {
        int i;
        int i2;
        int i3;
        if (this.h == 1 && (i = this.j) != 0 && (i2 = this.k) != 0 && (i3 = this.i) != 0) {
            return new xxm(this.a, this.b, this.c, this.d, this.e, this.f, this.g, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" allowExternalReporting");
        }
        if (this.j == 0) {
            sb.append(" scope");
        }
        if (this.k == 0) {
            sb.append(" entryPoint");
        }
        if (this.i == 0) {
            sb.append(" dialog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        if (i != 0) {
            this.k = i;
            return;
        }
        throw new NullPointerException("Null entryPoint");
    }

    public final void c(int i) {
        if (i != 0) {
            this.j = i;
            return;
        }
        throw new NullPointerException("Null scope");
    }
}
