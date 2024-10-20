package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rfv implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rfv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        tql tqlVar;
        switch (this.b) {
            case 0:
                return (ryg) this.a.b();
            case 1:
                return (mgi) this.a.b();
            case 2:
                Object obj = this.a;
                UpdateAttachmentAfterResizingAction updateAttachmentAfterResizingAction = (UpdateAttachmentAfterResizingAction) obj;
                rhl rhlVar = updateAttachmentAfterResizingAction.u;
                String l = rhlVar.l("content_uri");
                String l2 = rhlVar.l("output_uri");
                String l3 = rhlVar.l("content_type");
                int a = rhlVar.a("processing_status");
                if (a != 0) {
                    if (a != 1) {
                        if (a == 2) {
                            tqlVar = tql.TOO_LARGE;
                        } else {
                            throw new IllegalArgumentException(a.bV(a, "code: "));
                        }
                    } else {
                        tqlVar = tql.FAILED;
                    }
                } else {
                    tqlVar = tql.SUCCEEDED;
                }
                if (((Integer) updateAttachmentAfterResizingAction.d.c("UpdateAttachmentAfterResizingAction#executeAction", new mrj(updateAttachmentAfterResizingAction, l2, l, tqlVar, l3, 12))).intValue() > 0) {
                    rbk.d(6, (Action) obj);
                    return null;
                }
                return null;
            case 3:
                return "_id:".concat(String.valueOf(((rkl) this.a).getString(0)));
            case 4:
                return "conversation_id:".concat(String.valueOf(((rkl) this.a).getString(1)));
            case 5:
                return "participant_id:".concat(String.valueOf(((rkl) this.a).getString(2)));
            case 6:
                return "is_normalized:".concat(String.valueOf(((rkl) this.a).getString(3)));
            case 7:
                return "rcs_group_join_status:".concat(String.valueOf(((rkl) this.a).getString(4)));
            case 8:
                return "is_c2p_only:".concat(String.valueOf(((rkl) this.a).getString(5)));
            case 9:
                return "_id:".concat(String.valueOf(((slh) this.a).getString(0)));
            case 10:
                return "conversation_id:".concat(String.valueOf(((slh) this.a).getString(1)));
            case 11:
                return "pin_status:".concat(String.valueOf(((slh) this.a).getString(2)));
            case 12:
                return "_id:".concat(String.valueOf(((rlf) this.a).getString(0)));
            case 13:
                return "cms_life_cycle:".concat(String.valueOf(((rlf) this.a).getString(19)));
            case 14:
                return "current_my_identity:".concat(String.valueOf(((rlf) this.a).getString(1)));
            case 15:
                return "snippet_text:".concat(String.valueOf(((rlf) this.a).getString(2)));
            case 16:
                return "archive_status:".concat(String.valueOf(((rlf) this.a).getString(3)));
            case 17:
                return "most_recent_timestamp_ms:".concat(String.valueOf(((rlf) this.a).getString(4)));
            case 18:
                return "subject:".concat(String.valueOf(((rlf) this.a).getString(5)));
            case 19:
                return "name:".concat(String.valueOf(((rlf) this.a).getString(6)));
            default:
                return "name_is_automatic:".concat(String.valueOf(((rlf) this.a).getString(7)));
        }
    }
}
