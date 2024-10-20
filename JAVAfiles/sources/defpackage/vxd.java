package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxd extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final uhj c;
    public final mbl d;
    private final anen e;

    public vxd(anen anenVar, anen anenVar2, uhj uhjVar, mbl mblVar) {
        this.e = anenVar;
        this.b = anenVar2;
        this.c = uhjVar;
        this.d = mblVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        ConversationIdType b = ruy.b(((vxe) apbtVar).b);
        if (b.b()) {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 80, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because conversation ID is empty");
            return aktp.ag(upm.d());
        }
        return aktp.ai(new vib(b, 16), this.b).i(new vfj(this, b, 11), this.e);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vxe.a.getParserForType();
    }
}
