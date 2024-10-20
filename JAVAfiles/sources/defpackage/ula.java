package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ula implements uld {
    private final ulc a;
    private final qif b;
    private final nyh c;
    private final nxt d;
    private final armf e;

    public ula(ulc ulcVar, qif qifVar, nyh nyhVar, nxt nxtVar, armf armfVar) {
        this.a = ulcVar;
        this.b = qifVar;
        this.c = nyhVar;
        this.d = nxtVar;
        this.e = armfVar;
    }

    private final alog b() {
        ArrayList arrayList = new ArrayList();
        ((Optional) ((apxx) this.e).a).ifPresent(new ter(arrayList, 20));
        return alog.n(arrayList);
    }

    private static List c() {
        return alzz.ap("sender_id", "message_protocol", "mms_subject", "mms_transaction_id", "mms_expiry", "mms_retrieve_text", "cloud_sync_id", "rcs_message_id_with_text_type", "etouffee_status", "rcs_file_transfer_session_id", "sms_error_code", "correlation_id", "is_hidden");
    }

    private static final int d() {
        if (!xxy.a()) {
            return umx.d(5);
        }
        return umx.b(9);
    }

    @Override // defpackage.uld
    public final List a() {
        if (this.b.h()) {
            rzy a = this.a.a(1, 2, umx.d(3));
            a.c = alog.s("message_status", "seen");
            a.e = 5;
            a.a = umx.e(3);
            String a2 = a.a();
            rzy a3 = this.a.a(1, 2, umx.d(3));
            a3.b = 1;
            a3.c = alzz.ap("read");
            a3.b("NEW.read");
            a3.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
            a3.a = "read";
            a3.e = 5;
            String a4 = a3.a();
            rzy a5 = this.a.a(1, 2, umx.d(5));
            a5.c = c();
            a5.a = umx.e(5);
            a5.e = 5;
            String a6 = a5.a();
            rzy a7 = this.a.b(5, 1).a(1, "message_id");
            a7.f = umx.d(5);
            String a8 = a7.a();
            ulb b = this.a.b(5, 2);
            Integer[] a9 = xxw.a();
            int length = a9.length;
            Integer[] numArr = new Integer[length + 1];
            System.arraycopy(a9, 0, numArr, 0, length);
            numArr[length] = Integer.valueOf(xxw.RESTORED_FROM_CMS.ordinal());
            rzy b2 = b.b(1, "message_id", numArr);
            b2.c = alog.r(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            b2.f = umx.d(4);
            b2.e = 5;
            b2.a = umx.e(4);
            String a10 = b2.a();
            rzy rzyVar = new rzy();
            rzyVar.i = 3;
            rzyVar.d = 32;
            rzyVar.b = 5;
            rzyVar.h = "message_id";
            rzyVar.c();
            rzyVar.f = d();
            rzyVar.g = this.d.a();
            String a11 = rzyVar.a();
            rzy a12 = this.a.b(4, 1).a(1, "message_id");
            a12.f = umx.d(5);
            a12.e = 5;
            String a13 = a12.a();
            rzy a14 = this.a.b(4, 2).a(1, "message_id");
            a14.f = umx.d(5);
            a14.e = 5;
            String a15 = a14.a();
            rzy a16 = this.a.b(4, 3).a(1, "message_id");
            a16.f = umx.d(5);
            a16.e = 5;
            String a17 = a16.a();
            rzy a18 = this.a.b(8, 1).a(1, "message_id");
            a18.f = umx.d(5);
            a18.e = 5;
            String a19 = a18.a();
            rzy a20 = this.a.b(8, 3).a(1, "message_id");
            a20.f = umx.d(5);
            a20.e = 5;
            String a21 = a20.a();
            rzy a22 = this.a.b(9, 1).a(1, "message_id");
            a22.f = umx.d(5);
            a22.e = 5;
            String a23 = a22.a();
            rzy a24 = this.a.b(9, 3).a(1, "message_id");
            a24.f = umx.d(5);
            a24.e = 5;
            String a25 = a24.a();
            rzy a26 = this.a.b(9, 2).a(1, "message_id");
            a26.c = alog.s("conversation_suggestion_type", "properties");
            a26.f = umx.d(5);
            a26.e = 5;
            ArrayList arrayList = new ArrayList(Arrays.asList(a2, a4, a6, a8, a10, a11, a13, a15, a17, a19, a21, a23, a25, a26.a()));
            if (this.c.a() && xxy.a()) {
                arrayList.addAll(b());
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        rzy rzyVar2 = new rzy();
        rzyVar2.i = 2;
        rzyVar2.d = 32;
        rzyVar2.b = 1;
        rzyVar2.c = alzz.ap("message_status", "seen");
        rzyVar2.a = umx.e(3);
        rzyVar2.e = 5;
        rzyVar2.c();
        rzyVar2.g = this.d.a();
        rzyVar2.f = umx.d(3);
        arrayList2.add(rzyVar2.a());
        rzy rzyVar3 = new rzy();
        rzyVar3.i = 2;
        rzyVar3.a = "read";
        rzyVar3.d = 32;
        rzyVar3.b = 1;
        rzyVar3.c = alzz.ap("read");
        rzyVar3.e = 5;
        rzyVar3.c();
        rzyVar3.g = this.d.a();
        rzyVar3.f = umx.d(3);
        rzyVar3.b("NEW.read");
        rzyVar3.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
        arrayList2.add(rzyVar3.a());
        rzy rzyVar4 = new rzy();
        rzyVar4.i = 2;
        rzyVar4.d = 32;
        rzyVar4.b = 1;
        rzyVar4.c = c();
        rzyVar4.a = umx.e(5);
        rzyVar4.e = 5;
        rzyVar4.c();
        rzyVar4.g = this.d.a();
        rzyVar4.f = umx.d(5);
        arrayList2.add(rzyVar4.a());
        rzy rzyVar5 = new rzy();
        rzyVar5.i = 1;
        rzyVar5.d = 32;
        rzyVar5.b = 5;
        rzyVar5.h = "message_id";
        rzyVar5.c();
        rzyVar5.g = this.d.a();
        rzyVar5.f = umx.d(5);
        arrayList2.add(rzyVar5.a());
        rzy rzyVar6 = new rzy();
        rzyVar6.i = 2;
        rzyVar6.d = 32;
        rzyVar6.b = 5;
        rzyVar6.c = alzz.ap(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        rzyVar6.a = umx.e(4);
        rzyVar6.h = "message_id";
        rzyVar6.e = 5;
        rzyVar6.c();
        rzyVar6.g = this.d.a();
        rzyVar6.f = umx.d(4);
        arrayList2.add(rzyVar6.a());
        rzy rzyVar7 = new rzy();
        rzyVar7.i = 3;
        rzyVar7.d = 32;
        rzyVar7.b = 5;
        rzyVar7.h = "message_id";
        rzyVar7.c();
        rzyVar7.g = this.d.a();
        rzyVar7.f = d();
        arrayList2.add(rzyVar7.a());
        rzy rzyVar8 = new rzy();
        rzyVar8.i = 1;
        rzyVar8.d = 32;
        rzyVar8.b = 4;
        rzyVar8.e = 5;
        rzyVar8.h = "message_id";
        rzyVar8.c();
        rzyVar8.g = this.d.a();
        rzyVar8.f = umx.d(5);
        arrayList2.add(rzyVar8.a());
        rzy rzyVar9 = new rzy();
        rzyVar9.i = 2;
        rzyVar9.d = 32;
        rzyVar9.b = 4;
        rzyVar9.e = 5;
        rzyVar9.h = "message_id";
        rzyVar9.c();
        rzyVar9.g = this.d.a();
        rzyVar9.f = umx.d(5);
        arrayList2.add(rzyVar9.a());
        rzy rzyVar10 = new rzy();
        rzyVar10.i = 3;
        rzyVar10.d = 32;
        rzyVar10.b = 4;
        rzyVar10.e = 5;
        rzyVar10.h = "message_id";
        rzyVar10.c();
        rzyVar10.g = this.d.a();
        rzyVar10.f = umx.d(5);
        arrayList2.add(rzyVar10.a());
        rzy rzyVar11 = new rzy();
        rzyVar11.i = 1;
        rzyVar11.d = 32;
        rzyVar11.b = 8;
        rzyVar11.e = 5;
        rzyVar11.h = "message_id";
        rzyVar11.c();
        rzyVar11.g = this.d.a();
        rzyVar11.f = umx.d(5);
        arrayList2.add(rzyVar11.a());
        rzy rzyVar12 = new rzy();
        rzyVar12.i = 3;
        rzyVar12.d = 32;
        rzyVar12.b = 8;
        rzyVar12.e = 5;
        rzyVar12.h = "message_id";
        rzyVar12.c();
        rzyVar12.g = this.d.a();
        rzyVar12.f = umx.d(5);
        arrayList2.add(rzyVar12.a());
        rzy rzyVar13 = new rzy();
        rzyVar13.i = 1;
        rzyVar13.d = 32;
        rzyVar13.b = 9;
        rzyVar13.e = 5;
        rzyVar13.h = "message_id";
        rzyVar13.c();
        rzyVar13.g = this.d.a();
        rzyVar13.f = umx.d(5);
        arrayList2.add(rzyVar13.a());
        rzy rzyVar14 = new rzy();
        rzyVar14.i = 3;
        rzyVar14.d = 32;
        rzyVar14.b = 9;
        rzyVar14.e = 5;
        rzyVar14.h = "message_id";
        rzyVar14.c();
        rzyVar14.g = this.d.a();
        rzyVar14.f = umx.d(5);
        arrayList2.add(rzyVar14.a());
        rzy rzyVar15 = new rzy();
        rzyVar15.i = 2;
        rzyVar15.d = 32;
        rzyVar15.b = 9;
        rzyVar15.c = alzz.ap("conversation_suggestion_type", "properties");
        rzyVar15.e = 5;
        rzyVar15.h = "message_id";
        rzyVar15.c();
        rzyVar15.g = this.d.a();
        rzyVar15.f = umx.d(5);
        arrayList2.add(rzyVar15.a());
        if (this.c.a() && xxy.a()) {
            arrayList2.addAll(b());
        }
        return arrayList2;
    }
}
