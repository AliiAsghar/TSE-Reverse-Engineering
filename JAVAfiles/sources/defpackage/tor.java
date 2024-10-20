package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tor implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tor(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v77, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.alhr
    public final Object get() {
        aquc aqucVar;
        switch (this.b) {
            case 0:
                return "sender_id:".concat(String.valueOf(((tos) this.a).getString(0)));
            case 1:
                return "user_ref_datetime:".concat(String.valueOf(((toh) this.a).getString(3)));
            case 2:
                return "_id:".concat(String.valueOf(((tpb) this.a).getString(0)));
            case 3:
                return "brand_id:".concat(String.valueOf(((tpb) this.a).getString(1)));
            case 4:
                return "name:".concat(String.valueOf(((tpb) this.a).getString(2)));
            case 5:
                return "description:".concat(String.valueOf(((tpb) this.a).getString(3)));
            case 6:
                return "logo_url:".concat(String.valueOf(((tpb) this.a).getString(4)));
            case 7:
                return "logo_uri:".concat(String.valueOf(((tpb) this.a).getString(5)));
            case 8:
                return "version_token:".concat(String.valueOf(((tpb) this.a).getString(6)));
            case 9:
                return "sender_id:".concat(String.valueOf(((tpm) this.a).getString(0)));
            case 10:
                return "brand_id:".concat(String.valueOf(((tpm) this.a).getString(1)));
            case 11:
                return "part_id:".concat(String.valueOf(((tpw) this.a).getString(0)));
            case 12:
                return "vmt_status:".concat(String.valueOf(((tpw) this.a).getString(1)));
            case 13:
                return "text:".concat(String.valueOf(((tpw) this.a).getString(2)));
            case 14:
                return "locale:".concat(String.valueOf(((tpw) this.a).getString(3)));
            case 15:
                xze xzeVar = ubf.a;
                vcv vcvVar = (vcv) this.a.b();
                synchronized (vcvVar.s) {
                    aqucVar = vcvVar.r;
                    if (aqucVar == null) {
                        alvw d = vcv.a.d();
                        d.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getExpressiveStickerChannel", 295, "GrpcChannelManager.java")).q("Creating Expressive Sticker gRPC Channel");
                        aqucVar = vcvVar.a((String) vcv.i.e(), vcvVar.f(6));
                        vcvVar.r = aqucVar;
                    }
                }
                return aqucVar;
            case 16:
                alvi alviVar = uci.a;
                this.a.run();
                return null;
            case 17:
                agoz agozVar = ((agmp) this.a).a;
                if (agozVar != null) {
                    ArrayList arrayList = new ArrayList();
                    return ucn.a(agozVar.C(arrayList), (String[]) arrayList.toArray(new String[0]));
                }
                return ucn.a(null, null);
            case 18:
                return Boolean.valueOf(((udo) this.a).a.isFirst());
            case 19:
                return Boolean.valueOf(((udo) this.a).a.isLast());
            default:
                return Boolean.valueOf(((udo) this.a).a.moveToLast());
        }
    }
}
