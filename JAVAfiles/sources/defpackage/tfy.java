package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfy extends agpc {
    public tfy(String[] strArr) {
        super("recent_gifs", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tfx b() {
        l();
        return new tfx(this.a.b());
    }

    public final void c(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new tgn(1)).collect(Collectors.joining(", ")));
    }
}
