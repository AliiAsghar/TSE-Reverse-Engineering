package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arci extends aqsx {
    private final Map a;

    public arci(Map map) {
        this.a = map;
    }

    @Override // defpackage.aqsx
    public final asmb a(String str) {
        return (asmb) this.a.get(str);
    }
}
