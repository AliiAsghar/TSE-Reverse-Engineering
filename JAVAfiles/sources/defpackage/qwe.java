package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwe extends xwb<qvo, UUID> implements Comparable<qwe> {
    public qwe(UUID uuid) {
        super(uuid);
    }

    public static qwe a(String str) {
        return new qwe(UUID.fromString(str));
    }

    public final String b() {
        return ((UUID) this.a).toString();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(qwe qweVar) {
        return ((UUID) this.a).compareTo((UUID) qweVar.a);
    }
}
