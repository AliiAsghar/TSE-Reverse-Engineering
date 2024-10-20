package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artp implements artx {
    public final Object a;
    private final /* synthetic */ int b;

    public artp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.artx
    public final Iterator a() {
        if (this.b != 0) {
            return new arqc(this);
        }
        return new arto(new aruk((artw) this.a));
    }
}
