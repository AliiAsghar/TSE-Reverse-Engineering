package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcp {
    public static final xze a = xze.g("Bugle", "MessageStatusHelper");
    public final armf b;
    public final armf c;
    private final yjr d;
    private final ryg e;
    private final xyt f;
    private final ytk g;
    private final trz h;
    private final armf i;
    private final psw j;
    private final ryg k;
    private final wfh l;

    public abcp(yjr yjrVar, wfh wfhVar, ryg rygVar, xyt xytVar, ytk ytkVar, trz trzVar, armf armfVar, armf armfVar2, armf armfVar3, psw pswVar, ryg rygVar2) {
        this.d = yjrVar;
        this.l = wfhVar;
        this.e = rygVar;
        this.f = xytVar;
        this.g = ytkVar;
        this.h = trzVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.i = armfVar3;
        this.j = pswVar;
        this.k = rygVar2;
    }

    private static String h(rry rryVar, Resources resources) {
        if (rryVar.a.f() == 0 && rryVar.aF() && rryVar.a.j()) {
            return resources.getString(R.string.message_status_rcs_delivery_failed_recipient_not_rcs);
        }
        return resources.getString(R.string.message_status_rcs_delivery_failed_recipient_not_rcs_and_no_fallback);
    }

    private final String i(rry rryVar, Resources resources) {
        if (d(rryVar.c(), rryVar.s())) {
            if (rryVar.ai()) {
                return resources.getString(R.string.waiting_to_connect_tap_for_options);
            }
            return resources.getString(R.string.message_status_waiting_for_connection);
        }
        if (rryVar.af()) {
            return resources.getString(R.string.message_status_rcs_stuck_in_sending_hint);
        }
        return resources.getString(R.string.message_status_sending);
    }

    public final String a(Resources resources, rry rryVar, rsa rsaVar, int i, int i2) {
        String str;
        if (this.h.i() && tvu.e(rryVar.b()) && rsaVar != null) {
            List V = rryVar.V();
            int size = V.size();
            Iterator it = V.iterator();
            while (true) {
                if (it.hasNext()) {
                    ParticipantsTable.BindData b = rsaVar.b(((rrx) it.next()).a);
                    if (b != null && !TextUtils.isEmpty(b.K())) {
                        str = b.K();
                        break;
                    }
                } else {
                    str = "";
                    break;
                }
            }
            if (str.isEmpty()) {
                return resources.getQuantityString(i, size, Integer.valueOf(size));
            }
            if (size > 1) {
                int i3 = size - 1;
                return resources.getString(i2, resources.getQuantityString(R.plurals.name_and_other_plural, i3, str, Integer.valueOf(i3)));
            }
            return resources.getString(i2, str);
        }
        return resources.getString(R.string.message_status_recipient_failed_decryption);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(android.content.Context r7, defpackage.rry r8, defpackage.rsa r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abcp.b(android.content.Context, rry, rsa, boolean):java.lang.String");
    }

    public final String c(Context context, rry rryVar, rsa rsaVar, int i, TextPaint textPaint) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Resources resources = context.getResources();
        int f = rryVar.f();
        ParticipantsTable.BindData bindData = null;
        if (f != 1) {
            if (f != 2) {
                if (f != 11) {
                    if (f != 15) {
                        if (f != 101) {
                            if (f != 103) {
                                if (f != 115) {
                                    tqr z = rryVar.z();
                                    if (!z.a() || !this.g.d()) {
                                        return null;
                                    }
                                    boolean booleanValue = ((Boolean) ytk.c.e()).booleanValue();
                                    int ordinal = z.ordinal();
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            if (ordinal != 3) {
                                                return null;
                                            }
                                            if (((yaq) this.f.a()).n()) {
                                                if (true != booleanValue) {
                                                    i7 = R.string.vsms_message_status_text_verification_in_progress;
                                                } else {
                                                    i7 = R.string.vsms_message_status_new_text_verification_in_progress;
                                                }
                                                return resources.getString(i7);
                                            }
                                            if (true != booleanValue) {
                                                i6 = R.string.vsms_message_status_text_waiting_for_connection;
                                            } else {
                                                i6 = R.string.vsms_message_status_new_text_waiting_for_connection;
                                            }
                                            return resources.getString(i6);
                                        }
                                        if (true != booleanValue) {
                                            i5 = R.string.vsms_message_status_text_unverified;
                                        } else {
                                            i5 = R.string.vsms_message_status_new_text_unverified;
                                        }
                                        return resources.getString(i5);
                                    }
                                    return rryVar.R();
                                }
                            } else {
                                return resources.getString(R.string.message_status_downloading);
                            }
                        }
                        if (rryVar.g() > 0 && rryVar.m() > 0) {
                            return resources.getString(R.string.message_status_download_with_expiration_and_size, Formatter.formatShortFileSize(context, rryVar.m()), new SimpleDateFormat("MMM d", yhx.b(context)).format(new Date(rryVar.g())));
                        }
                        return resources.getString(R.string.message_status_download);
                    }
                } else {
                    int size = rryVar.f.size();
                    if (size != 0 && rsaVar != null) {
                        int i8 = rsaVar.e;
                        if (i8 == 1) {
                            if (size != 1) {
                                i8 = 1;
                            }
                        }
                        if (i8 == rryVar.X().size()) {
                            if (true != rryVar.am()) {
                                i4 = R.string.message_status_media_seen_by_all;
                            } else {
                                i4 = R.string.message_status_seen_by_all;
                            }
                            return resources.getString(i4);
                        }
                        List X = rryVar.X();
                        StringBuilder sb = new StringBuilder();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= X.size()) {
                                break;
                            }
                            rrx rrxVar = (rrx) X.get(i9);
                            ParticipantsTable.BindData b = rsaVar.b(rrxVar.a);
                            if (b == null) {
                                xyo e = a.e();
                                e.H("Read message not loaded.");
                                e.e(rrxVar.a);
                                e.c(rryVar.u());
                                e.q();
                                break;
                            }
                            if (i9 > 0) {
                                sb.append(", ");
                            }
                            sb.append(((iew) this.i.b()).n(b, false));
                            i9++;
                        }
                        String sb2 = sb.toString();
                        if (true != rryVar.am()) {
                            i3 = R.plurals.message_status_media_seen_by_list;
                        } else {
                            i3 = R.plurals.message_status_seen_by_list;
                        }
                        String quantityString = resources.getQuantityString(i3, X.size(), sb2);
                        if (textPaint != null) {
                            wfh wfhVar = this.l;
                            resources.getString(R.string.plus_n);
                            return wfhVar.B(quantityString, textPaint, i, R.plurals.plus_n_plural);
                        }
                        return quantityString;
                    }
                    if (true != rryVar.am()) {
                        i2 = R.string.message_status_seen_media;
                    } else {
                        i2 = R.string.message_status_seen_121;
                    }
                    return resources.getString(i2);
                }
            } else {
                return resources.getString(R.string.message_status_delivered);
            }
        }
        if (g(rryVar)) {
            if (rryVar.aQ()) {
                return resources.getString(R.string.message_status_sms_auto_fallback_sent);
            }
            return resources.getString(R.string.message_status_mms_auto_fallback_sent);
        }
        if (rryVar.aQ()) {
            if (rsaVar != null && rsaVar.e > 1) {
                return resources.getString(R.string.broadcast_sms_text);
            }
            return resources.getString(R.string.sms_text);
        }
        if (rryVar.av()) {
            return resources.getString(R.string.mms_text);
        }
        if (rryVar.aF()) {
            if (rsaVar != null) {
                bindData = rsaVar.a();
            }
            if (bindData != null && e(rryVar, bindData)) {
                return h(rryVar, resources);
            }
            if (f(rryVar)) {
                return resources.getString(R.string.message_status_rcs_not_delivered_recipient_may_be_offline);
            }
            if (rryVar.ae()) {
                return resources.getString(R.string.message_status_rcs_not_delivered_hint);
            }
            return resources.getString(R.string.message_status_sent);
        }
        xyo b2 = a.b();
        b2.H("MessageStatusHelper#getOutgoingCompleteOrRevocationPendingString on impossible message type:");
        b2.F(rryVar.c());
        b2.q();
        return "";
    }

    public final boolean d(int i, SelfIdentityId selfIdentityId) {
        qwm c;
        if (!((yaq) this.f.a()).r() || (c = this.e.c(selfIdentityId)) == null || ((yaq) this.f.a()).a(i, c.e()) != yay.UNAVAILABLE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (((defpackage.psv) r6.get()).g() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (((defpackage.psv) r6.get()).f() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.rry r6, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r7) {
        /*
            r5 = this;
            int r0 = r6.b()
            boolean r0 = defpackage.tvu.c(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = r6.aF()
            if (r0 != 0) goto L13
            return r1
        L13:
            int r0 = r7.n()
            r2 = 1
            if (r0 != r2) goto L1b
            return r1
        L1b:
            utz r0 = defpackage.vye.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
            int r0 = r6.f()
            r3 = 17
            if (r0 != r3) goto L33
            r0 = r2
            goto L34
        L33:
            r0 = r1
        L34:
            int r3 = r6.f()
            boolean r3 = defpackage.rvx.q(r3)
            if (r3 != 0) goto L3f
            goto Laf
        L3f:
            psw r3 = r5.j
            boolean r3 = r3.a()
            if (r3 == 0) goto L89
            ryg r6 = r5.k
            armf r3 = r5.c
            java.lang.Object r3 = r3.b()
            msk r3 = (defpackage.msk) r3
            msh r7 = r3.q(r7)
            j$.util.Optional r7 = r7.e()
            qsb r3 = new qsb
            r3.<init>(r6, r1)
            j$.util.Optional r6 = r7.map(r3)
            nfp r7 = new nfp
            r3 = 20
            r7.<init>(r3)
            j$.util.Optional r6 = r6.filter(r7)
            qqi r7 = new qqi
            r7.<init>(r3)
            j$.util.Optional r6 = r6.map(r7)
            boolean r7 = r6.isPresent()
            if (r7 == 0) goto Laf
            java.lang.Object r6 = r6.get()
            psv r6 = (defpackage.psv) r6
            boolean r6 = r6.g()
            if (r6 != 0) goto Laf
            goto Lb1
        L89:
            java.lang.String r7 = r7.O()
            j$.util.Optional r7 = j$.util.Optional.ofNullable(r7)
            yuq r3 = new yuq
            r4 = 10
            r3.<init>(r5, r6, r4)
            j$.util.Optional r6 = r7.flatMap(r3)
            boolean r7 = r6.isPresent()
            if (r7 == 0) goto Laf
            java.lang.Object r6 = r6.get()
            psv r6 = (defpackage.psv) r6
            boolean r6 = r6.f()
            if (r6 != 0) goto Laf
            goto Lb1
        Laf:
            if (r0 == 0) goto Lb2
        Lb1:
            return r2
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abcp.e(rry, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData):boolean");
    }

    public final boolean f(rry rryVar) {
        saz sazVar = rryVar.a;
        sazVar.ao(144, "recipient_offline_timestamp_ms");
        Optional optional = sazVar.bU;
        if (rryVar.aF() && rvx.q(rryVar.f()) && optional.isPresent() && Instant.ofEpochMilli(rryVar.k()).isAfter((Instant) optional.get())) {
            return true;
        }
        return false;
    }

    public final boolean g(rry rryVar) {
        if (!rryVar.aF() && rvx.q(rryVar.f()) && tqf.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE.equals(rryVar.b.G())) {
            return true;
        }
        return false;
    }
}
