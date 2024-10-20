package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rll implements aglx {
    public static final rll a = new rll();
    public static final Map b = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("current_my_identity"), d("current_my_identity_foreign_key")), new armo(c("snippet_text"), d("snippet_text")), new armo(c("archive_status"), d("archive_status")), new armo(c("most_recent_timestamp_ms"), d("cms_most_recent_read_message_timestamp_ms")), new armo(c("subject"), d("subject_text")), new armo(c("name"), d("name")), new armo(c("name_is_automatic"), d("name_is_automatic")), new armo(c("has_rbm_participant"), d("has_ea2p_bot_recipient")), new armo(c("rcs_group_self_msisdn"), d("rcs_group_self_msisdn")), new armo(c("rcs_group_id"), d("rcs_group_id")), new armo(c("rcs_conference_uri"), d("rcs_conference_uri")), new armo(c("rcs_group_capabilities"), d("rcs_group_capabilities")), new armo(c("error_state"), d("error_state")), new armo(c("rcs_subject_change_timestamp_ms"), d("rcs_subject_change_timestamp_ms")), new armo(c("join_state"), d("join_state")), new armo(c("conversation_type"), d("conv_type")), new armo(c("send_mode"), d("send_mode")), new armo(c("cms_id"), d("cms_id")), new armo(c("cms_life_cycle"), d("cms_life_cycle")));

    private rll() {
    }

    private static final rld c(String str) {
        String str2;
        agmh[] h = uho.h();
        for (int i = 0; i < 20; i++) {
            agmh agmhVar = h[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rld) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final smv d(String str) {
        String str2;
        agmh[] K = wcm.K();
        for (int i = 0; i < 75; i++) {
            agmh agmhVar = K[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (smv) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rlg rlgVar = new rlg();
        rlgVar.e();
        rlgVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("conversations_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rld[] rldVarArr = (rld[]) map.keySet().toArray(new rld[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rldVarArr, rldVarArr.length));
        snf e = sni.e();
        e.q();
        smv[] smvVarArr = (smv[]) map.values().toArray(new smv[0]);
        e.c((smv[]) Arrays.copyOf(smvVarArr, smvVarArr.length));
        agofVar.c = e.b();
        agofVar.a().a();
    }
}
