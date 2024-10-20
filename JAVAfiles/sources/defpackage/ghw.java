package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.MultiShareActivity;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghw {
    public final Object a;

    public ghw() {
        throw null;
    }

    public static /* synthetic */ Object k(Object obj) {
        boolean z;
        WeakReference weakReference = (WeakReference) obj;
        weakReference.getClass();
        if (weakReference.get() == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Optional r(apwt apwtVar) {
        try {
            return Optional.of((CronetEngine) apwtVar.b());
        } catch (IllegalStateException | UnsatisfiedLinkError unused) {
            return Optional.empty();
        }
    }

    private static final String w(eqn eqnVar) {
        Locale.Category category;
        Locale locale;
        String str = eqnVar.d;
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            Locale forLanguageTag = Locale.forLanguageTag(str);
            category = Locale.Category.DISPLAY;
            locale = Locale.getDefault(category);
            String displayName = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(displayName)) {
                try {
                    int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    return displayName.substring(0, offsetByCodePoints).toUpperCase(locale) + displayName.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                    return displayName;
                }
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    private final List x(fup fupVar) {
        boolean z;
        String str;
        int i;
        List list;
        byte[] bArr;
        euf eufVar = new euf(fupVar.e);
        ?? r12 = this.a;
        while (eufVar.b() > 0) {
            int j = eufVar.j();
            int j2 = eufVar.b + eufVar.j();
            if (j == 134) {
                r12 = new ArrayList();
                int j3 = eufVar.j() & 31;
                for (int i2 = 0; i2 < j3; i2++) {
                    String y = eufVar.y(3);
                    int j4 = eufVar.j();
                    if ((j4 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = j4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte j5 = (byte) eufVar.j();
                    eufVar.K(1);
                    if (z) {
                        int i3 = j5 & 64;
                        byte[] bArr2 = etj.a;
                        if (i3 != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    eqm eqmVar = new eqm();
                    eqmVar.b(str);
                    eqmVar.d = y;
                    eqmVar.G = i;
                    eqmVar.p = list;
                    r12.add(new eqn(eqmVar));
                }
            }
            eufVar.J(j2);
            r12 = r12;
        }
        return r12;
    }

    public final int a() {
        Rect rect = new Rect();
        ((RecyclerView) this.a).getGlobalVisibleRect(rect);
        return rect.height();
    }

    public final void b(Runnable runnable) {
        ((RecyclerView) this.a).removeCallbacks(runnable);
    }

    public final void c(Runnable runnable) {
        int[] iArr = eek.a;
        ((View) this.a).postOnAnimation(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arqr r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gdz
            if (r0 == 0) goto L13
            r0 = r7
            gdz r0 = (defpackage.gdz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            gdz r0 = new gdz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ghw r6 = r0.d
            defpackage.aqil.P(r7)     // Catch: defpackage.gdv -> L29
            goto L4f
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r7)
            gbz r7 = new gbz     // Catch: defpackage.gdv -> L48
            r2 = 0
            r4 = 2
            r7.<init>(r5, r6, r2, r4)     // Catch: defpackage.gdv -> L48
            r0.d = r5     // Catch: defpackage.gdv -> L48
            r0.b = r3     // Catch: defpackage.gdv -> L48
            java.lang.Object r6 = defpackage.arwi.d(r7, r0)     // Catch: defpackage.gdv -> L48
            if (r6 != r1) goto L4f
            return r1
        L48:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L4b:
            ghw r0 = r7.a
            if (r0 != r6) goto L52
        L4f:
            arnb r6 = defpackage.arnb.a
            return r6
        L52:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghw.d(arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gkd, java.lang.Object] */
    public final gjj e(String str) {
        String obj = arsd.D(str).toString();
        int length = obj.length();
        ?? r2 = this.a;
        if (length >= 3) {
            String substring = obj.substring(0, 3);
            substring.getClass();
            String upperCase = substring.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                return new gjh(r2, str);
            }
        }
        return new gji(r2, str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void f(gjk gjkVar) {
        gjkVar.getClass();
        int i = gjkVar.a;
        ?? r1 = this.a;
        Integer valueOf = Integer.valueOf(i);
        Object obj = r1.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            r1.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        Integer valueOf2 = Integer.valueOf(gjkVar.b);
        if (treeMap.containsKey(valueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(valueOf2) + " with " + gjkVar);
        }
        treeMap.put(valueOf2, gjkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, ascd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.asaj r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ghz
            if (r0 == 0) goto L13
            r0 = r6
            ghz r0 = (defpackage.ghz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ghz r0 = new ghz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.aqil.P(r6)
            goto L3d
        L2f:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.a
            r0.b = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            armj r5 = new armj
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghw.g(asaj, arpe):java.lang.Object");
    }

    public final void h(gef gefVar) {
        ged gedVar;
        if (gefVar instanceof ged) {
            gedVar = (ged) gefVar;
        } else {
            gedVar = null;
        }
        Object obj = this.a;
        ((ibp) ((gcc) obj).i.a).a(gedVar, new gck(gefVar, 1));
    }

    public final ged i() {
        return (ged) ((ibp) this.a).a;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [asai, java.lang.Object] */
    public final asai j(gbb gbbVar) {
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ((iba) ((ibp) this.a).b).b;
            }
            throw new IllegalArgumentException("invalid load type for hints");
        }
        return ((iba) ((ibp) this.a).d).b;
    }

    public final String l(eqn eqnVar) {
        int i = eqnVar.j;
        if (i == -1) {
            return "";
        }
        return ((Resources) this.a).getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    public final String m(eqn eqnVar) {
        String o = o(w(eqnVar), n(eqnVar));
        if (TextUtils.isEmpty(o)) {
            if (TextUtils.isEmpty(eqnVar.b)) {
                return "";
            }
            return eqnVar.b;
        }
        return o;
    }

    public final String n(eqn eqnVar) {
        String str;
        if ((eqnVar.f & 2) != 0) {
            str = ((Resources) this.a).getString(R.string.exo_track_role_alternate);
        } else {
            str = "";
        }
        if ((eqnVar.f & 4) != 0) {
            str = o(str, ((Resources) this.a).getString(R.string.exo_track_role_supplementary));
        }
        if ((eqnVar.f & 8) != 0) {
            str = o(str, ((Resources) this.a).getString(R.string.exo_track_role_commentary));
        }
        if ((eqnVar.f & 1088) != 0) {
            return o(str, ((Resources) this.a).getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public final String o(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = ((Resources) this.a).getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }

    public final fvq p(fup fupVar) {
        return new fvq(x(fupVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final Optional q() {
        return (Optional) this.a.get();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ascv, java.lang.Object] */
    public final lgj s() {
        return new lgj(((nei) this.a).a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void t(Activity activity, ajwt ajwtVar, MessageCoreData messageCoreData, amwf amwfVar) {
        ClipData clipData;
        amwfVar.getClass();
        ((ahqr) this.a.b()).e(ljo.b);
        Intent intent = new Intent(activity, (Class<?>) MultiShareActivity.class);
        intent.putExtra("draft_data", messageCoreData);
        intent.putExtra("intent_source", amwfVar.e);
        intent.addFlags(1);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        ArrayList arrayList = new ArrayList();
        for (Object obj : ((MessageData) messageCoreData).i) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
            if (messagePartCoreData.aV() && messagePartCoreData.t() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ClipData.Item(((MessagePartCoreData) it.next()).t()));
        }
        List az = aqjn.az(arrayList2);
        if (!az.isEmpty()) {
            clipData = new ClipData(new ClipDescription("Attachment", new String[]{"text/uri-list"}), (ClipData.Item) az.get(0));
            int size = az.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem((ClipData.Item) az.get(i));
            }
        } else {
            clipData = null;
        }
        intent.setClipData(clipData);
        if (kpt.a() && ajwtVar != null) {
            ajya.c(intent, ajwtVar);
        }
        akto.n(activity, intent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final atal u(int i) {
        return new atal((Context) this.a.b(), i, (byte[]) null);
    }

    public final kkc v(fup fupVar) {
        return new kkc(x(fupVar), (byte[]) null);
    }

    public ghw(Object obj) {
        this.a = obj;
    }

    public ghw(Object obj, byte[] bArr) {
        this.a = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ghw(byte[] bArr, byte[] bArr2, char[] cArr) {
        this(alsx.a, (byte[]) null);
        int i = alog.d;
    }

    public ghw(byte[] bArr, char[] cArr) {
        this.a = ascy.a(new int[7]);
    }

    public ghw(char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public ghw(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ghw(List list) {
        alob alobVar = new alob();
        alobVar.j(list);
        this.a = alobVar;
    }

    public ghw(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ghw(fvz... fvzVarArr) {
        alob alobVar = new alob();
        alobVar.i(fvzVarArr);
        this.a = alobVar;
    }

    public ghw(Resources resources) {
        dzg.g(resources);
        this.a = resources;
    }

    public ghw(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ghw(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ghw(short[] sArr) {
        this.a = new ibp();
    }

    public ghw(Context context) {
        context.getClass();
        this.a = context;
    }

    public ghw(gcn gcnVar, Object obj, arqg arqgVar) {
        this.a = new gbl(arqgVar instanceof geb ? new ghu((Object) arqgVar, 1, (byte[]) null) : new jue(arqgVar, (arpe) null, 1), obj, gcnVar).f;
    }

    public ghw(char[] cArr, byte[] bArr) {
        this.a = ascy.a(true);
    }

    public ghw(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public /* synthetic */ ghw(gcn gcnVar, arqg arqgVar) {
        this(gcnVar, (Object) null, arqgVar);
    }

    public ghw(asai asaiVar, arwe arweVar) {
        asaiVar.getClass();
        arweVar.getClass();
        asai a = asar.a(new jxj(asaiVar, 20));
        int i = ascp.a;
        this.a = arrn.T(a, arweVar, asco.a, mmy.a);
    }

    public /* synthetic */ ghw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new gdy(this);
    }

    public ghw(RecyclerView recyclerView, byte[] bArr) {
        d.s(recyclerView != null);
        this.a = recyclerView;
    }

    public ghw(byte[] bArr, int[] iArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_labels._id";
        a.c = new wsy();
        a.a();
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new lbx(13);
        a2.a = "message_labels.message_id";
        a2.e(true);
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new lbx(15);
        a3.a = "message_labels.label";
        a3.e(true);
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "message_labels.confidence";
        a4.c = new wsy();
        a4.a();
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "message_labels.source";
        a5.c = new wsy();
        a5.a();
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.c(true);
        a6.a = "message_labels.intent";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "message_labels.model_id";
        a7.c = new wsy();
        a7.a();
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.c(true);
        a8.d(true);
        a8.a = "messages.conversation_id";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 1;
        a9.c(true);
        a9.a = "messages.received_timestamp";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 2;
        a10.j(true);
        a10.f(true);
        a10.c(true);
        a10.a = "messages._id";
        a10.c = new wsy();
        this.a = new lck(a10.a());
        agmi a11 = agmk.a();
        a11.d = 1;
        a11.c(true);
        a11.d(true);
        a11.a = "messages.sender_id";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.a = "messages.sender_send_destination";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 4;
        a13.a = "messages.msisdn_receiving_rcs_message";
        a13.c = new wsy();
        a13.a();
        agmi a14 = agmk.a();
        a14.d = 4;
        a14.a = "messages.receiving_network_country";
        a14.c = new wsy();
        a14.a();
        agmi a15 = agmk.a();
        a15.d = 1;
        a15.c(true);
        a15.a = "messages.sent_timestamp";
        a15.c = new wsy();
        a15.a();
        agmi a16 = agmk.a();
        a16.d = 1;
        a16.a = "messages.queue_insert_timestamp";
        a16.c = new wsy();
        a16.a();
        agmi a17 = agmk.a();
        a17.d = 1;
        a17.a = "messages.message_protocol";
        a17.c = new wsy();
        a17.a();
        agmi a18 = agmk.a();
        a18.d = 1;
        a18.c(true);
        a18.a = "messages.message_status";
        a18.c = new wsy();
        a18.a();
        agmi a19 = agmk.a();
        a19.d = 1;
        a19.a = "messages.message_report_status";
        a19.c = new wsy();
        a19.a();
        agmi a20 = agmk.a();
        a20.d = 1;
        a20.c(true);
        a20.a = "messages.seen";
        a20.e(true);
        a20.c = new wsy();
        a20.a();
        agmi a21 = agmk.a();
        a21.d = 1;
        a21.c(true);
        a21.a = "messages.read";
        a21.c = new wsy();
        a21.a();
        agmi a22 = agmk.a();
        a22.d = 4;
        a22.c(true);
        a22.a = "messages.sms_message_uri";
        a22.c = new wsy();
        a22.a();
        agmi a23 = agmk.a();
        a23.d = 1;
        a23.a = "messages.sms_priority";
        a23.c = new wsy();
        a23.a();
        agmi a24 = agmk.a();
        a24.d = 1;
        a24.a = "messages.sms_message_size";
        a24.c = new wsy();
        a24.a();
        agmi a25 = agmk.a();
        a25.d = 4;
        a25.a = "messages.mms_subject";
        a25.c = new wsy();
        a25.a();
        agmi a26 = agmk.a();
        a26.d = 4;
        a26.a = "messages.mms_transaction_id";
        a26.c = new wsy();
        a26.a();
        agmi a27 = agmk.a();
        a27.d = 4;
        a27.a = "messages.mms_content_location";
        a27.c = new wsy();
        a27.a();
        agmi a28 = agmk.a();
        a28.d = 1;
        a28.a = "messages.mms_expiry";
        a28.c = new wsy();
        a28.a();
        agmi a29 = agmk.a();
        a29.d = 1;
        a29.c(true);
        a29.a = "messages.rcs_expiry";
        a29.c = new wsy();
        a29.a();
        agmi a30 = agmk.a();
        a30.d = 4;
        a30.a = "messages.mms_retrieve_text";
        a30.c = new wsy();
        a30.a();
        agmi a31 = agmk.a();
        a31.d = 1;
        a31.a = "messages.raw_status";
        a31.c = new wsy();
        a31.a();
        agmi a32 = agmk.a();
        a32.d = 1;
        a32.c(true);
        a32.d(true);
        a32.a = "messages.self_id";
        a32.c = new wsy();
        a32.a();
        agmi a33 = agmk.a();
        a33.d = 4;
        a33.c(true);
        a33.a = "messages.my_identity";
        a33.c = new wsy();
        a33.a();
        agmi a34 = agmk.a();
        a34.d = 4;
        a34.c(true);
        a34.d(true);
        a34.b = new lbx(14);
        a34.a = "messages.my_identity_foreign_key";
        a34.c = new wsy();
        a34.a();
        agmi a35 = agmk.a();
        a35.d = 1;
        a35.a = "messages.retry_start_timestamp";
        a35.c = new wsy();
        a35.a();
        agmi a36 = agmk.a();
        a36.d = 4;
        a36.c(true);
        a36.a = "messages.cloud_sync_id";
        a36.c = new wsy();
        a36.a();
        agmi a37 = agmk.a();
        a37.d = 7;
        a37.c(true);
        a37.a = "messages.rcs_message_id";
        a37.e(true);
        a37.c = new wsy();
        a37.a();
        agmi a38 = agmk.a();
        a38.d = 4;
        a38.c(true);
        a38.a = "messages.rcs_message_id_with_text_type";
        a38.e(true);
        a38.c = new wsy();
        a38.a();
        agmi a39 = agmk.a();
        a39.d = 1;
        a39.a = "messages.etouffee_status";
        a39.c = new wsy();
        a39.a();
        agmi a40 = agmk.a();
        a40.d = 1;
        a40.a = "messages.verification_status";
        a40.c = new wsy();
        a40.a();
        agmi a41 = agmk.a();
        a41.d = 1;
        a41.a = "messages.rcs_ui_status";
        a41.c = new wsy();
        a41.a();
        agmi a42 = agmk.a();
        a42.d = 1;
        a42.c(true);
        a42.a = "messages.is_hidden";
        a42.c = new wsy();
        a42.a();
        agmi a43 = agmk.a();
        a43.d = 7;
        a43.a = "messages.rcs_remote_instance";
        a43.c = new wsy();
        a43.a();
        agmi a44 = agmk.a();
        a44.d = 1;
        a44.a = "messages.rcs_file_transfer_session_id";
        a44.c = new wsy();
        a44.a();
        agmi a45 = agmk.a();
        a45.d = 1;
        a45.a = "messages.sms_error_code";
        a45.c = new wsy();
        a45.a();
        agmi a46 = agmk.a();
        a46.d = 4;
        a46.a = "messages.sms_error_desc_map_name";
        a46.c = new wsy();
        a46.a();
        agmi a47 = agmk.a();
        a47.d = 4;
        a47.a = "messages.correlation_id";
        a47.c = new wsy();
        a47.a();
        agmi a48 = agmk.a();
        a48.d = 4;
        a48.j(true);
        a48.c(true);
        a48.a = "messages.cms_id";
        a48.e(true);
        a48.c = new wsy();
        a48.a();
        agmi a49 = agmk.a();
        a49.d = 2;
        a49.a = "messages.cms_last_mod_seq";
        a49.c = new wsy();
        a49.a();
        agmi a50 = agmk.a();
        a50.d = 4;
        a50.c(true);
        a50.a = "messages.web_id";
        a50.c = new wsy();
        a50.a();
        agmi a51 = agmk.a();
        a51.d = 1;
        a51.a = "messages.usage_stats_logging_id";
        a51.c = new wsy();
        a51.a();
        agmi a52 = agmk.a();
        a52.d = 1;
        a52.a = "messages.send_counter";
        a52.c = new wsy();
        a52.a();
        agmi a53 = agmk.a();
        a53.d = 4;
        a53.c(true);
        a53.a = "messages.original_rcs_message_id";
        a53.c = new wsy();
        a53.a();
        agmi a54 = agmk.a();
        a54.d = 4;
        a54.a = "messages.custom_delivery_receipt_mime_type";
        a54.c = new wsy();
        a54.a();
        agmi a55 = agmk.a();
        a55.d = 5;
        a55.a = "messages.custom_delivery_receipt_content";
        a55.c = new wsy();
        a55.a();
        agmi a56 = agmk.a();
        a56.d = 1;
        a56.a = "messages.report_attempt_acounter";
        a56.c = new wsy();
        a56.a();
        agmi a57 = agmk.a();
        a57.d = 5;
        a57.a = "messages.custom_headers";
        a57.c = new wsy();
        a57.a();
        agmi a58 = agmk.a();
        a58.d = 4;
        a58.j(true);
        a58.c(true);
        a58.a = "messages.cms_correlation_id";
        a58.e(true);
        a58.c = new wsy();
        a58.a();
        agmi a59 = agmk.a();
        a59.d = 1;
        a59.c(true);
        a59.d(true);
        a59.b = new lbx(16);
        a59.a = "messages.group_private_participant";
        a59.c = new wsy();
        a59.a();
        agmi a60 = agmk.a();
        a60.d = 1;
        a60.c(true);
        a60.d(true);
        a60.b = new lbx(17);
        a60.a = "messages.original_message_id";
        a60.c = new wsy();
        a60.a();
        agmi a61 = agmk.a();
        a61.d = 1;
        a61.a = "messages.awaiting_reverse_sync";
        a61.c = new wsy();
        a61.a();
        agmi a62 = agmk.a();
        a62.d = 4;
        a62.a = "messages.old_sms_message_uri";
        a62.c = new wsy();
        a62.a();
        agmi a63 = agmk.a();
        a63.d = 4;
        a63.j(true);
        a63.c(true);
        a63.a = "messages.draft_id";
        a63.e(true);
        a63.c = new wsy();
        a63.a();
        agmi a64 = agmk.a();
        a64.d = 1;
        a64.a = "messages.result_code";
        a64.c = new wsy();
        a64.a();
        agmi a65 = agmk.a();
        a65.d = 1;
        a65.a = "messages.cms_life_cycle";
        a65.c = new wsy();
        a65.a();
        agmi a66 = agmk.a();
        a66.d = 1;
        a66.a = "messages.fallback_reason";
        a66.c = new wsy();
        a66.a();
        agmi a67 = agmk.a();
        a67.d = 1;
        a67.a = "messages.auto_retry_counter";
        a67.c = new wsy();
        a67.a();
        agmi a68 = agmk.a();
        a68.d = 2;
        a68.a = "messages.can_revoke_before_delivered_with_rcs";
        a68.c = new wsy();
        a68.a();
        agmi a69 = agmk.a();
        a69.d = 5;
        a69.a = "messages.trace_id";
        a69.c = new wsy();
        a69.a();
        agmi a70 = agmk.a();
        a70.d = 1;
        a70.a = "messages.outgoing_delivery_report_status";
        a70.c = new wsy();
        a70.a();
        agmi a71 = agmk.a();
        a71.d = 1;
        a71.a = "messages.outgoing_read_report_status";
        a71.c = new wsy();
        a71.a();
        agmi a72 = agmk.a();
        a72.d = 1;
        a72.a = "messages.xms_transport";
        a72.c = new wsy();
        a72.a();
        agmi a73 = agmk.a();
        a73.d = 1;
        a73.a = "messages.message_original_protocol";
        a73.c = new wsy();
        a73.a();
        agmi a74 = agmk.a();
        a74.d = 4;
        a74.j(true);
        a74.c(true);
        a74.a = "messages.satellite_datagram_id";
        a74.e(true);
        a74.c = new wsy();
        a74.a();
        agmi a75 = agmk.a();
        a75.d = 1;
        a75.a = "messages.encryption_protocol";
        a75.c = new wsy();
        a75.a();
        agmi a76 = agmk.a();
        a76.d = 4;
        a76.j(true);
        a76.c(true);
        a76.a = "messages.message_persistence_id";
        a76.e(true);
        a76.c = new wsy();
        a76.a();
    }

    public ghw(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public ghw(nei neiVar) {
        neiVar.getClass();
        this.a = neiVar;
    }

    public ghw(int[] iArr) {
        this.a = ascy.a(Integer.MAX_VALUE);
    }

    public ghw(apwt apwtVar) {
        this.a = albo.D(new ezp(apwtVar, 18));
    }
}
