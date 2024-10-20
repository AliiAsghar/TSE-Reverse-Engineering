package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoc implements hnt {
    private final hqh a;

    public hoc(hqh hqhVar) {
        this.a = hqhVar;
    }

    @Override // defpackage.hnt
    public final /* bridge */ /* synthetic */ hnu a(Object obj) {
        return new hod((InputStream) obj, this.a);
    }

    @Override // defpackage.hnt
    public final Class b() {
        return InputStream.class;
    }
}
