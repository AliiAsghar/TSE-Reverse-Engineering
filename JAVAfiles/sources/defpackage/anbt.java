package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbt extends RuntimeException {
    private static final long serialVersionUID = 1;
    public final List a;

    public anbt(List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.a = list;
    }
}
