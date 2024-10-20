package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zca extends arrd implements arqy {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zca(Object obj, int i) {
        super(5, obj, zcc.class, "transformToDialogUiData", "transformToDialogUiData(ZZLcom/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector$GroupLimitExcludingSelf;Lcom/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector$CombinedChipData;)Lcom/google/android/libraries/communications/ux/components/dialog/DialogUiData$Alert;", 4);
        this.a = i;
    }

    @Override // defpackage.arqy
    public final /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return ((zdi) this.b).a((zdr) obj, (zcx) obj2, (List) obj3, (List) obj4, arnv.a);
            }
            lix lixVar = (lix) obj;
            List list = (List) obj2;
            List list2 = (List) obj3;
            List list3 = (List) obj4;
            ljh ljhVar = (ljh) this.b;
            if (((CharSequence) ljhVar.e.a().a()).length() == 0) {
                return ljhVar.l;
            }
            ljh.a.l("combining personal, work and corp contact and group chat suggestions");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(lixVar.b);
            if (!list3.isEmpty()) {
                String string = ljhVar.b.getString(R.string.multi_share_group_directory_header);
                string.getClass();
                arrayList.add(new lio("group_header", new aesl(string)));
                arrayList.addAll(list3);
            }
            if (!list.isEmpty() || !list2.isEmpty()) {
                arrayList.add(ljhVar.a());
                arrayList.addAll(list);
                arrayList.addAll(list2);
            }
            return new lix(lixVar.a, arrayList, new kdt((Object) lixVar, (Object) ljhVar, (Object) list3, 7, (byte[]) null));
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        zbw zbwVar = (zbw) obj3;
        zbv zbvVar = (zbv) obj4;
        zcc zccVar = (zcc) this.b;
        if (booleanValue && zbwVar.a < zbvVar.c.size()) {
            return zccVar.c((ChipData) aqjn.ac(zbvVar.c), zbwVar.a);
        }
        if (!booleanValue && zbwVar.b < zbvVar.c.size()) {
            return zccVar.c((ChipData) aqjn.ac(zbvVar.c), zbwVar.b);
        }
        if (!booleanValue && !zbvVar.a.isEmpty()) {
            if (zbvVar.a.size() > 1) {
                xyo e = zcc.a.e();
                e.H("More than 1 non-Rcs contact were detected");
                e.q();
            }
            ChipData chipData = (ChipData) zbvVar.a.get(0);
            String string2 = zccVar.c.getString(R.string.create_new_group_message_v2);
            string2.getClass();
            return zccVar.b(string2, arnv.a, new yyy(zccVar, 13), new zdh(zccVar, chipData, 1));
        }
        if (booleanValue2 || zbvVar.b.isEmpty() || !zbvVar.a.isEmpty()) {
            return null;
        }
        if (zbvVar.b.size() > 1) {
            xyo e2 = zcc.a.e();
            e2.H("More than 1 non-E2ee contact were detected");
            e2.q();
        }
        ChipData chipData2 = (ChipData) zbvVar.b.get(0);
        Context context = zccVar.c;
        String str = chipData2.b;
        String bs = yyb.bs(context);
        String string3 = context.getString(R.string.contact_picker_downgrade_to_non_e2ee_group_alert_message_with_learn_more, str, bs);
        string3.getClass();
        String str2 = (String) trz.a.e();
        str2.getClass();
        bs.getClass();
        return zccVar.b(string3, aqjn.y(new aeif(str2, arsd.T(string3, bs, 0, 6), arsd.T(string3, bs, 0, 6) + bs.length(), new wup(str2, zccVar, 11, null), 24)), new yyy(zccVar, 12), new quz(zccVar, chipData2, 20, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zca(Object obj, int i, byte[] bArr) {
        super(5, obj, ljh.class, "transformWithGroupChats", "transformWithGroupChats(Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zca(Object obj, int i, char[] cArr) {
        super(5, obj, zdi.class, "transformWithProfileV2", "transformWithProfileV2(Lcom/google/android/apps/messaging/startchat/suggestion/ProfileSuggestionUiData;Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;Ljava/util/List;Ljava/util/List;)Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;", 4);
        this.a = i;
    }
}
