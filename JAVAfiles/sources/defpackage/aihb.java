package defpackage;

import j$.util.Optional;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihb implements aihe {
    private final aihc a;

    public aihb(aihc aihcVar) {
        this.a = aihcVar;
    }

    @Override // defpackage.aihe
    public final Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.aihe
    public final Socket b() {
        return this.a.a().accept();
    }
}
