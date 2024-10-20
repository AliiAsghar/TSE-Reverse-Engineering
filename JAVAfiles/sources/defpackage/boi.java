package defpackage;

import defpackage.abb;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class boi extends arrp implements arqr<abb.b<Float>, arnb> {
    public static final boi a = new boi();

    public boi() {
        super(1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        abb.b bVar = (abb.b) obj;
        bVar.a = 6000;
        Float valueOf = Float.valueOf(90.0f);
        abb.a a2 = bVar.a(valueOf, 300);
        aae aaeVar = bva.a;
        a2.b = bva.b;
        bVar.a(valueOf, 1500);
        Float valueOf2 = Float.valueOf(180.0f);
        bVar.a(valueOf2, 1800);
        bVar.a(valueOf2, 3000);
        Float valueOf3 = Float.valueOf(270.0f);
        bVar.a(valueOf3, 3300);
        bVar.a(valueOf3, 4500);
        Float valueOf4 = Float.valueOf(360.0f);
        bVar.a(valueOf4, 4800);
        bVar.a(valueOf4, 6000);
        return arnb.a;
    }
}
