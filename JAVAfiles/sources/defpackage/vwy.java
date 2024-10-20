package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwy extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final anen c;
    public final armf d;
    public final armf e;
    public final pss f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;

    public vwy(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, pss pssVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = anenVar;
        this.c = anenVar2;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = pssVar;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.k = armfVar7;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RemoveMembersFromRcsConversationHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        vwz vwzVar = (vwz) apbtVar;
        ConversationIdType b = ruy.b(vwzVar.c);
        return aktp.ai(new vwu(this, b, 2), this.b).i(new vwx(this, b, vwzVar, 2), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vwz.a.getParserForType();
    }
}
