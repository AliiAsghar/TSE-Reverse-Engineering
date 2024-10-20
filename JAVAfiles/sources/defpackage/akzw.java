package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzw extends akzy {
    private final Optional b = Optional.empty();
    private final Optional c = Optional.empty();
    private final Optional d = Optional.empty();
    private final Optional e = Optional.empty();
    private List f;

    @Override // defpackage.akzy
    public final akzz b() {
        List list = this.f;
        if (list != null) {
            return new akzz(this.b, this.c, this.d, this.e, list);
        }
        throw new IllegalStateException("Missing required properties: attendeeList");
    }

    @Override // defpackage.akzy
    public final void c(List list) {
        this.f = list;
    }
}
