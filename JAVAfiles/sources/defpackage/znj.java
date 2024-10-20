package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelUuid;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.ZoneId;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znj {
    public final Object a;
    public final Object b;

    public znj(armf armfVar, zlc zlcVar) {
        this.b = zlcVar;
        this.a = armfVar;
    }

    public static String D(long j) {
        if (j <= 0) {
            return "0:00";
        }
        if (j >= 359999000) {
            return "99:59:59";
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        if (hours > 0) {
            return String.format(Locale.US, "%1d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds));
        }
        return String.format(Locale.US, "%01d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    public static final int H(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((Configuration) optional.get()).mInstantMessageConfiguration.mMaxSize1toM;
    }

    public static final int I(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((Configuration) optional.get()).mInstantMessageConfiguration.mMaxAdhocGroupSize;
    }

    public static final int J(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((Configuration) optional.get()).mInstantMessageConfiguration.mMaxSize1to1;
    }

    public static final ParticipantsTable.BindData L(List list) {
        List<ParticipantsTable.BindData> ak = ak(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = ak.size();
        for (ParticipantsTable.BindData bindData : ak) {
            if (bindData.R()) {
                arrayList.add(bindData);
            }
            if (bindData.T()) {
                ypj G = yyb.G(bindData.m());
                if (G.c()) {
                    arrayList2.add(bindData);
                } else if (G.d()) {
                    arrayList3.add(bindData);
                }
            }
        }
        if (size == 1 && !arrayList.isEmpty()) {
            return (ParticipantsTable.BindData) arrayList.get(0);
        }
        if (!arrayList2.isEmpty()) {
            return (ParticipantsTable.BindData) arrayList2.get(0);
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        return (ParticipantsTable.BindData) arrayList3.get(0);
    }

    private static List ak(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (bindData.p() == -2) {
                arrayList.add(bindData);
            }
        }
        return arrayList;
    }

    public static final ypk j(ConversationIdType conversationIdType, boolean z) {
        float f;
        Integer num = (Integer) ymd.a.e();
        int intValue = num.intValue() - rwd.b(conversationIdType);
        num.getClass();
        float intValue2 = num.intValue();
        float max = (float) Math.max(intValue / (intValue2 + intValue2), 0.0d);
        if (true != z) {
            f = 0.5f;
        } else {
            f = brg.a;
        }
        return new ypk(max + f);
    }

    public static Object q(Context context, Uri uri, algk algkVar, Object obj) {
        return new znj(context).p(uri, algkVar, obj);
    }

    public static String s(Context context, String str) {
        if (gh.m(str)) {
            return context.getString(R.string.new_image_file_name_format);
        }
        if (gh.z(str)) {
            return context.getString(R.string.new_video_file_name_format);
        }
        return context.getString(R.string.new_file_name_format);
    }

    public static String u(String str) {
        if ("3gpp".equals(str)) {
            return "3gp";
        }
        if ("3gpp2".equals(str)) {
            return "3g2";
        }
        return str;
    }

    public final CharSequence A(long j) {
        return ((znj) this.b).E(j, false, false, false, true);
    }

    public final CharSequence B(long j, boolean z, boolean z2, boolean z3) {
        return ((znj) this.b).E(j, z, z2, z3, false);
    }

    public final String C(long j) {
        if (j <= 0) {
            j = 0;
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        Resources resources = ((Context) this.a).getResources();
        StringBuilder sb = new StringBuilder();
        if (hours > 0) {
            int i = (int) hours;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_hours, i, Integer.valueOf(i)));
        }
        if (minutes > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            int i2 = (int) minutes;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_minutes, i2, Integer.valueOf(i2)));
        }
        if (seconds > 0 || j == 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            int i3 = (int) seconds;
            sb.append(resources.getQuantityString(R.plurals.content_description_duration_seconds, i3, Integer.valueOf(i3)));
        }
        return sb.toString();
    }

    public final CharSequence E(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        String str;
        String str2;
        int i2;
        if (true != DateFormat.is24HourFormat((Context) this.a)) {
            i = 64;
        } else {
            i = 128;
        }
        int i3 = i;
        long epochMilli = ((xnv) this.b).f().toEpochMilli();
        Locale locale = ((Context) this.a).getResources().getConfiguration().locale;
        locale.getClass();
        if (z4) {
            return yyb.aY((Context) this.a, j, i3);
        }
        long abs = Math.abs(epochMilli - j);
        if (!z2 && abs < 60000) {
            CharSequence text = ((Context) this.a).getResources().getText(R.string.am_posted_now);
            text.getClass();
            return text;
        }
        if (!z2 && abs < 3600000) {
            Object obj = this.a;
            if (true != z3) {
                i2 = R.plurals.bugle_num_minutes_ago;
            } else {
                i2 = R.plurals.bugle_content_description_num_minutes_ago;
            }
            long j2 = abs / 60000;
            String quantityString = ((Context) obj).getResources().getQuantityString(i2, (int) j2);
            quantityString.getClass();
            String format = String.format(quantityString, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            format.getClass();
            return format;
        }
        ZoneId systemDefault = ZoneId.systemDefault();
        systemDefault.getClass();
        if (yyb.aV(j, epochMilli, systemDefault) == 0) {
            return yyb.aY((Context) this.a, j, i3);
        }
        if (abs < 604800000) {
            Object obj2 = this.a;
            if (z) {
                String formatDateTime = DateUtils.formatDateTime((Context) obj2, j, 32770 | i3);
                formatDateTime.getClass();
                return formatDateTime;
            }
            if (d.F(locale, Locale.US)) {
                if (true != z3) {
                    str = "EEE HH:mm";
                } else {
                    str = "EEEE HH:mm";
                }
                if (true != z3) {
                    str2 = "EEE h:mm aa";
                } else {
                    str2 = "EEEE h:mm aa";
                }
                return yyb.aW(j, i3, str, str2);
            }
            String formatDateTime2 = DateUtils.formatDateTime((Context) obj2, j, 32771 | i3);
            formatDateTime2.getClass();
            return formatDateTime2;
        }
        if (abs < 31449600000L) {
            Object obj3 = this.a;
            if (z) {
                String formatDateTime3 = DateUtils.formatDateTime((Context) obj3, j, 65560 | i3);
                formatDateTime3.getClass();
                return formatDateTime3;
            }
            if (d.F(locale, Locale.US)) {
                return yyb.aW(j, i3, "MMM d, HH:mm", "MMM d, h:mm aa");
            }
            String formatDateTime4 = DateUtils.formatDateTime((Context) obj3, j, 65561 | i3);
            formatDateTime4.getClass();
            return formatDateTime4;
        }
        return yyb.aX((Context) this.a, j, locale, z, i3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [msk, java.lang.Object] */
    @Deprecated
    public final Optional F(Configuration configuration) {
        String G = G(configuration);
        if (albo.ah(G)) {
            return Optional.empty();
        }
        return Optional.of(this.b.r(G));
    }

    public final String G(Configuration configuration) {
        adju c = configuration.c();
        if (c != null) {
            String str = c.l;
            if (!albo.ah(str)) {
                return albo.ag(adwf.k(str, (yjr) this.a));
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    public final ParticipantsTable.BindData K(ConversationIdType conversationIdType) {
        aiut.b();
        List<ParticipantsTable.BindData> ak = ak(((rtz) this.a.b()).K(conversationIdType));
        if (ak.isEmpty()) {
            return null;
        }
        if (ak.size() == 1) {
            return (ParticipantsTable.BindData) ak.get(0);
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (ParticipantsTable.BindData bindData : ak) {
            hashMap.put(bindData.M(), bindData);
            if (bindData.T()) {
                ypj G = yyb.G(bindData.m());
                if (G.c()) {
                    return bindData;
                }
                if (G.b()) {
                    arrayList.add(bindData);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return (ParticipantsTable.BindData) arrayList.get(0);
        }
        MessageCoreData f = ((rwd) this.b.b()).f(conversationIdType);
        if (f != null && hashMap.containsKey(f.aw())) {
            return (ParticipantsTable.BindData) hashMap.get(f.aw());
        }
        alog B = ((rwd) this.b.b()).B(conversationIdType, 1);
        if (B != null && !B.isEmpty() && hashMap.containsKey(((MessageCoreData) B.get(0)).aw())) {
            return (ParticipantsTable.BindData) hashMap.get(((MessageCoreData) B.get(0)).aw());
        }
        return (ParticipantsTable.BindData) ak.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final xvh M(msh mshVar, String str) {
        Context context = (Context) this.b.b();
        context.getClass();
        xve xveVar = (xve) this.a.b();
        xveVar.getClass();
        str.getClass();
        return new xvh(context, xveVar, mshVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final xvg N(msh mshVar, String str) {
        Context context = (Context) this.b.b();
        context.getClass();
        xve xveVar = (xve) this.a.b();
        xveVar.getClass();
        str.getClass();
        return new xvg(context, xveVar, mshVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final xvf O(msh mshVar, String str) {
        Context context = (Context) this.b.b();
        context.getClass();
        xve xveVar = (xve) this.a.b();
        xveVar.getClass();
        str.getClass();
        return new xvf(context, xveVar, mshVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final long P() {
        Object b = this.a.b();
        b.getClass();
        return ((Number) b).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final wul Q() {
        return (wul) this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xnu
            if (r0 == 0) goto L13
            r0 = r5
            xnu r0 = (defpackage.xnu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xnu r0 = new xnu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            wul r5 = r4.Q()
            r0.b = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            xnt r5 = (defpackage.xnt) r5
            boolean r5 = r5.c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znj.R(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final Optional S() {
        boolean z;
        Object e = ((utz) wzp.a.get()).e();
        try {
            z = Boolean.valueOf(((xju) ((xjw) this.a.b()).g.l()).g);
        } catch (apba unused) {
            z = false;
        }
        if (d.F(e, z)) {
            if ((((Boolean) ((utz) wzp.a.get()).e()).booleanValue() && ((xjw) this.a.b()).c() && !((wzp) this.b.b()).u()) || (!((Boolean) ((utz) wzp.a.get()).e()).booleanValue() && ((xjw) this.a.b()).c())) {
                return Optional.of(amvm.APP_STARTUP_RESUME_SYNC);
            }
            return Optional.empty();
        }
        ((xjw) this.a.b()).g.m(new xgu(11));
        return Optional.of(amvm.REDESIGN_FLAG_FLIP);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    public final ListenableFuture T(aqfn aqfnVar) {
        akul c;
        aqfnVar.getClass();
        c = qjh.c(this.b, arpj.a, arwf.a, new xgk(this, aqfnVar, (arpe) null, 0));
        return c;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final ListenableFuture U(aqfn aqfnVar) {
        akul c;
        aqfnVar.getClass();
        c = qjh.c(this.b, arpj.a, arwf.a, new xgk(this, aqfnVar, (arpe) null, 2, (byte[]) null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul V(qfb qfbVar) {
        return ((wpp) this.a).g(qfbVar.c).h(new wxv(qfbVar, 18), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean W() {
        if (((yxb) this.b.b()).a()) {
            return false;
        }
        return ((ansy) ((njc) this.a).a.b()).e("bugle.enable_server_side_overrides_from_mobile_config_lib");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final wyf X() {
        Context context = (Context) this.a.b();
        context.getClass();
        ydk ydkVar = (ydk) this.b.b();
        ydkVar.getClass();
        return new wyf(context, ydkVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wwn] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, wwn] */
    public final amva Y(adiv adivVar) {
        String str;
        String str2 = adom.n(adivVar).a;
        wxb wxbVar = (wxb) this.a.j(adivVar).orElse(wxb.a);
        wwz a = this.a.a();
        aozy createBuilder = amva.a.createBuilder();
        createBuilder.getClass();
        if (wxbVar == null || (str = wxbVar.p) == null) {
            str = "";
        }
        akec.N(str, createBuilder);
        akec.K(a.c.equals(str2), createBuilder);
        akec.M(a.d.equals(str2), createBuilder);
        akec.L(a.e.equals(str2), createBuilder);
        return akec.J(createBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, wwn] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wwn] */
    /* JADX WARN: Type inference failed for: r8v12, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z(defpackage.amvy r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znj.Z(amvy, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final zgl a(Activity activity, View view, boolean z) {
        abdc abdcVar = (abdc) this.a.b();
        abdcVar.getClass();
        abbu abbuVar = (abbu) this.b.b();
        abbuVar.getClass();
        activity.getClass();
        return new zgl(abdcVar, abbuVar, activity, view, z);
    }

    public final boolean aa(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        String q = ((yjy) this.b).h(i).q();
        if (q == null && (q = ((yjy) this.b).h(i2).q()) == null) {
            return false;
        }
        try {
            List d = adwq.b((Context) this.a).d(ParcelUuid.fromString(q));
            d.getClass();
            ArrayList arrayList = new ArrayList(aqjn.J(d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSubscriptionId()));
            }
            if (arrayList.contains(Integer.valueOf(i))) {
                if (arrayList.contains(Integer.valueOf(i2))) {
                    return true;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final wul ab(wus wusVar) {
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.b, wusVar.a, new wki(new wup(this, wusVar, 2, null), 3));
        computeIfAbsent.getClass();
        zap zapVar = (zap) computeIfAbsent;
        String str = (String) wusVar.b.orElse("");
        str.getClass();
        boolean z = ((wus) zapVar.e).f;
        boolean z2 = wusVar.f;
        if (z == z2) {
            Object computeIfAbsent2 = ConcurrentMap.EL.computeIfAbsent(zapVar.c, str, new wki(new uxc(zapVar, 14), 4));
            computeIfAbsent2.getClass();
            return (wul) computeIfAbsent2;
        }
        throw new IllegalStateException("Requesting cache state " + z2 + " but it is already " + z);
    }

    public final Object ac(MessageCoreData messageCoreData) {
        int i;
        alog r;
        MessageData messageData = (MessageData) messageCoreData;
        if (!messageData.i.isEmpty()) {
            Object obj = this.b;
            MessagesTable.BindData I = messageCoreData.I();
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) aqjn.X(messageData.i);
            if (!messagePartCoreData.be()) {
                r = alog.r(messagePartCoreData.D());
                r.getClass();
            } else {
                String ad = messagePartCoreData.ad();
                if (ad != null) {
                    wrj j = wcm.j(ad);
                    tbg q = messagePartCoreData.D().q();
                    q.t("text/plain");
                    Object obj2 = this.a;
                    wri wriVar = j.c;
                    if (wriVar == null) {
                        wriVar = wri.a;
                    }
                    wrh b = wrh.b(wriVar.c);
                    if (b == null) {
                        b = wrh.UNRECOGNIZED;
                    }
                    if (b == wrh.HELP_NOT_LONGER_NEED) {
                        i = R.string.end_of_emergency_help_not_needed;
                    } else {
                        i = R.string.end_of_emergency_help_needed;
                    }
                    q.X(((Context) obj2).getString(i));
                    r = alog.r(q.a());
                    r.getClass();
                } else {
                    throw new IllegalArgumentException("MessageCoreData as invalid EoE attachment");
                }
            }
            Uri a = ((ukx) obj).a(I, r);
            if (a != null) {
                return a;
            }
            return aqil.O(new IllegalStateException("Failed to insert the message into database."));
        }
        throw new IllegalArgumentException("MessageCoreData has no parts.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tqx] */
    public final MessageCoreData ad(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, apct apctVar, wqh wqhVar) {
        wqhVar.getClass();
        return this.b.m(str, selfIdentityId, conversationIdType, wqhVar.f, wch.n(apctVar), ((Context) this.a).getString(wqhVar.g));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [nwj, java.lang.Object] */
    public final wni ae(ListenableFuture listenableFuture) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        wni wniVar = new wni(anenVar, this.b);
        wniVar.a(listenableFuture);
        return wniVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xyt, java.lang.Object] */
    public final adjl af(String str) {
        return new adjl(((vrn) this.b.a()).e(str));
    }

    public final Optional ag(String str) {
        return ((adnk) this.a).i(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    public final void ah() {
        ((mbl) this.a.b()).c("Bugle.Notification.RcsNotDelivered.Tapped.Count");
        aozy createBuilder = amwi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amwi amwiVar = (amwi) createBuilder.b;
        amwiVar.c = 4;
        amwiVar.b |= 1;
        amwi amwiVar2 = (amwi) createBuilder.s();
        aozy createBuilder2 = amwo.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amwo amwoVar = (amwo) apagVar;
        amwiVar2.getClass();
        amwoVar.d = amwiVar2;
        amwoVar.c = 5;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amwo amwoVar2 = (amwo) createBuilder2.b;
        amwoVar2.g = 2;
        amwoVar2.b = 4 | amwoVar2.b;
        amwo amwoVar3 = (amwo) createBuilder2.s();
        maq maqVar = (maq) this.b.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.NOTIFICATION_METRICS_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amwoVar3.getClass();
        amfrVar2.aU = amwoVar3;
        amfrVar2.f |= 2048;
        maqVar.j(amfqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qei ai() {
        return (qei) ((vbu) this.b.b()).e().orElseThrow(new vtc(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object aj(defpackage.ahka r7, defpackage.ahka r8, defpackage.arqr r9, defpackage.arpe r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.vvq
            if (r0 == 0) goto L13
            r0 = r10
            vvq r0 = (defpackage.vvq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            vvq r0 = new vvq
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            ahqp r7 = r0.f
            ahqq r8 = r0.e
            ahka r9 = r0.d
            ahka r1 = r0.c
            znj r0 = r0.h
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L34
            r2 = r7
            r7 = r1
            goto L6b
        L34:
            r10 = move-exception
            r2 = r7
            r7 = r1
            r5 = r10
            r10 = r8
            r8 = r9
            r9 = r5
            goto L7d
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            defpackage.aqil.P(r10)
            java.lang.Object r10 = r6.b
            ahqr r10 = (defpackage.ahqr) r10
            ahqq r10 = r10.d()
            r10.getClass()
            ahqp r2 = defpackage.ahqp.SUCCESS
            r0.h = r6     // Catch: java.lang.Throwable -> L7b
            r0.c = r7     // Catch: java.lang.Throwable -> L7b
            r0.d = r8     // Catch: java.lang.Throwable -> L7b
            r0.e = r10     // Catch: java.lang.Throwable -> L7b
            r0.f = r2     // Catch: java.lang.Throwable -> L7b
            r0.b = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L7b
            if (r9 == r1) goto L7a
            r0 = r6
            r5 = r9
            r9 = r8
            r8 = r10
            r10 = r5
        L6b:
            java.lang.Object r1 = r0.b
            ahqr r1 = (defpackage.ahqr) r1
            r1.f(r8, r7, r4, r2)
            java.lang.Object r7 = r0.a
            ahpf r7 = (defpackage.ahpf) r7
            r7.b(r9, r4)
            return r10
        L7a:
            return r1
        L7b:
            r9 = move-exception
            r0 = r6
        L7d:
            ahqp r2 = defpackage.ahqp.ERROR     // Catch: java.lang.Throwable -> L80
            throw r9     // Catch: java.lang.Throwable -> L80
        L80:
            r9 = move-exception
            java.lang.Object r1 = r0.b
            ahqr r1 = (defpackage.ahqr) r1
            r1.f(r10, r7, r4, r2)
            java.lang.Object r7 = r0.a
            ahpf r7 = (defpackage.ahpf) r7
            r7.b(r8, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znj.aj(ahka, ahka, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public final void b(amlx amlxVar, String str) {
        zlc zlcVar = (zlc) this.b;
        zlcVar.b(true);
        ((mbl) zlcVar.c.b()).c(str);
        ((mho) zlcVar.a.b()).S(amlw.RCS_PROVISIONING_PROMPT_ACCEPTED, amlxVar);
        ykw ykwVar = (ykw) this.a.b();
        ykwVar.j("rcs_tos_state", 2);
        ykwVar.h("fast_track_prompt_dismissed", true);
        ykwVar.h("should_show_google_tos_prompt", false);
        ykwVar.h("did_show_google_tos_prompt", true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    public final void c(amlx amlxVar, String str) {
        zlc zlcVar = (zlc) this.b;
        zlcVar.b(false);
        ((mbl) zlcVar.c.b()).c(str);
        ((mho) zlcVar.a.b()).S(amlw.RCS_PROVISIONING_PROMPT_DECLINED, amlxVar);
        ykw ykwVar = (ykw) this.a.b();
        ykwVar.h("fast_track_prompt_dismissed", true);
        ykwVar.h("did_show_google_tos_prompt", true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final void d(String str) {
        this.a.f(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ gdk e() {
        ahqr ahqrVar = (ahqr) this.b.b();
        ahqrVar.getClass();
        ifq ifqVar = (ifq) this.a.b();
        ifqVar.getClass();
        return new zac(ahqrVar, ifqVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [armf, java.lang.Object] */
    public final void f(String str, rry rryVar) {
        rryVar.getClass();
        if (str.length() > 0) {
            String b = uzc.b(str);
            wyp wypVar = (wyp) this.b.b();
            MessageIdType u = rryVar.u();
            u.getClass();
            b.getClass();
            wypVar.H(u, b);
            if (yyb.e(rryVar)) {
                aozy createBuilder = yyk.a.createBuilder();
                long j = rryVar.t().a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ((yyk) apagVar).c = j;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((yyk) createBuilder.b).b = b;
                String F = rryVar.F();
                if (F == null) {
                    F = "";
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((yyk) createBuilder.b).d = F;
                boolean aL = rryVar.aL();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((yyk) createBuilder.b).e = aL;
                yyk yykVar = (yyk) createBuilder.s();
                yyh yyhVar = new yyh();
                apxh.e(yyhVar);
                aklt.a(yyhVar, yykVar);
                yyhVar.q(((cj) this.a.b()).a(), null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean g() {
        if (((Optional) this.b).isPresent() || Settings.Global.getInt(((Context) this.a).getContentResolver(), "vt_ims_enabled", 1) != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final String h() {
        return ((yjr) this.b.b()).m();
    }

    public final String i() {
        String locale = yhx.b((Context) this.a).toString();
        locale.getClass();
        return locale;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [armf, java.lang.Object] */
    public final List k(ConversationIdType conversationIdType, List list) {
        akrh e;
        alog C;
        conversationIdType.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        if (!conversationIdType.b() && !list.isEmpty() && !((ypr) this.b.b()).a(conversationIdType)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                if (bindData.T()) {
                    ypi ypiVar = ypi.a;
                    if (yyb.H(bindData.m()).b()) {
                        rwd rwdVar = (rwd) this.a.b();
                        String M = bindData.M();
                        akrh e2 = aktp.e("MessageDatabaseOperations#getLatestMessageByConversationAndSender");
                        try {
                            MessageCoreData messageCoreData = null;
                            if (((Boolean) ((utz) rwd.b.get()).e()).booleanValue()) {
                                e = aktp.e("MessageDatabaseOperations#getEarliestOrLatestIncomingMessageByConversationAndSender");
                                try {
                                    alog Q = rwdVar.Q(conversationIdType, M);
                                    if (Q != null && Q.size() == 1) {
                                        messageCoreData = (MessageCoreData) Q.get(0);
                                    }
                                    e.close();
                                } finally {
                                }
                            } else {
                                e = aktp.e("MessageDatabaseOperations#getLatestMessagesByConversationAndSender");
                                try {
                                    if (((Boolean) ((utz) rwd.b.get()).e()).booleanValue()) {
                                        C = rwdVar.Q(conversationIdType, M);
                                    } else {
                                        syc sycVar = new syc();
                                        sycVar.f(conversationIdType);
                                        sycVar.F(M);
                                        sycVar.Q(100, 115);
                                        C = rwdVar.C(new syb(sycVar), 1);
                                    }
                                    e.close();
                                    if (C != null && C.size() == 1) {
                                        messageCoreData = (MessageCoreData) C.get(0);
                                    }
                                } finally {
                                }
                            }
                            e2.close();
                            if (messageCoreData != null) {
                                arrayList.add(bindData);
                            }
                        } catch (Throwable th) {
                            try {
                                e2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final ykh l(yjo yjoVar, int i) {
        yyt yytVar = (yyt) this.a.b();
        yytVar.getClass();
        yjy yjyVar = (yjy) this.b.b();
        yjyVar.getClass();
        yjoVar.getClass();
        return new ykh(yytVar, yjyVar, yjoVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [apwt, java.lang.Object] */
    public final akul m() {
        if (yig.e() && ((Optional) this.b.b()).isPresent()) {
            return ((yiz) ((Optional) this.b.b()).get()).b();
        }
        aozy createBuilder = yiy.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yiy.b((yiy) createBuilder.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yiy.a((yiy) createBuilder.b);
        return aktp.ag((yiy) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public final boolean n() {
        Context context = (Context) this.a;
        return ((ykw) this.b.b()).q(context.getString(R.string.notification_vibration_pref_key), context.getResources().getBoolean(R.bool.notification_vibration_pref_default));
    }

    public final int o(int i, int i2) {
        String extractMetadata = ((MediaMetadataRetriever) this.b).extractMetadata(i);
        if (TextUtils.isEmpty(extractMetadata)) {
            return i2;
        }
        return Integer.parseInt(extractMetadata);
    }

    public final Object p(Uri uri, algk algkVar, Object obj) {
        try {
            try {
                try {
                    ((MediaMetadataRetriever) this.b).setDataSource((Context) this.a, uri);
                    obj = algkVar.apply(this);
                } catch (IOException e) {
                    ((alwl) ((alwl) ((alwl) yhh.a.h()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/MediaMetadataRetrieverWrapper", "extractMetadata", 'B', "MediaMetadataRetrieverWrapper.java")).q("Error extracting metadata");
                }
                r();
                return obj;
            } catch (RuntimeException e2) {
                r();
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            r();
            throw th;
        }
    }

    public final void r() {
        try {
            ((MediaMetadataRetriever) this.b).release();
        } catch (Exception e) {
            ((alwl) ((alwl) ((alwl) yhh.a.h()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/MediaMetadataRetrieverWrapper", "release", ']', "MediaMetadataRetrieverWrapper.java")).q("MediaMetadataRetriever.release failed");
        }
    }

    public final String t(String str) {
        String extensionFromMimeType;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (str == null) {
            extensionFromMimeType = null;
        } else {
            extensionFromMimeType = singleton.getExtensionFromMimeType(str);
        }
        Object obj = this.b;
        String ag = albo.ag(u(extensionFromMimeType));
        Object obj2 = this.a;
        String format = new SimpleDateFormat(s((Context) obj, str), Locale.US).format(new Date(((xnv) obj2).f().toEpochMilli()));
        format.getClass();
        return format + "." + ag;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    public final void v(Collection collection) {
        this.b.clear();
        this.b.addAll(collection);
    }

    public final CharSequence w(long j) {
        return B(j, true, false, false);
    }

    public final CharSequence x(long j) {
        int i;
        if (true != DateFormat.is24HourFormat((Context) this.a)) {
            i = 64;
        } else {
            i = 128;
        }
        int i2 = i;
        return yyb.aX((Context) this.a, j, ((Context) this.a).getResources().getConfiguration().locale, false, i2);
    }

    public final CharSequence y(long j) {
        int i;
        znj znjVar = (znj) this.b;
        if (true != DateFormat.is24HourFormat((Context) znjVar.a)) {
            i = 64;
        } else {
            i = 128;
        }
        long epochMilli = ((xnv) znjVar.b).f().toEpochMilli();
        long j2 = epochMilli - j;
        ZoneId systemDefault = ZoneId.systemDefault();
        systemDefault.getClass();
        long aV = yyb.aV(j, epochMilli, systemDefault);
        if (aV == 0) {
            return yyb.aY((Context) znjVar.a, j, i);
        }
        if (aV == 1) {
            Context context = (Context) znjVar.a;
            String string = context.getResources().getString(R.string.message_metadata_separator);
            string.getClass();
            String string2 = context.getResources().getString(R.string.posted_yesterday, string, yyb.aY(context, j, i));
            string2.getClass();
            return string2;
        }
        if (j2 < 604800000) {
            Context context2 = (Context) znjVar.a;
            Resources resources = context2.getResources();
            resources.getClass();
            String formatDateTime = DateUtils.formatDateTime(context2, j, 2);
            String string3 = resources.getString(R.string.message_metadata_separator);
            string3.getClass();
            String string4 = resources.getString(R.string.posted_this_week, formatDateTime, string3, yyb.aY(context2, j, i));
            string4.getClass();
            return string4;
        }
        if (j2 < 31449600000L) {
            Context context3 = (Context) znjVar.a;
            Resources resources2 = context3.getResources();
            resources2.getClass();
            String formatDateTime2 = DateUtils.formatDateTime(context3, j, 65562 | i);
            String string5 = resources2.getString(R.string.message_metadata_separator);
            string5.getClass();
            String string6 = resources2.getString(R.string.posted_this_year, formatDateTime2, string5, yyb.aY(context3, j, i));
            string6.getClass();
            return string6;
        }
        Context context4 = (Context) znjVar.a;
        String string7 = context4.getResources().getString(R.string.message_metadata_separator);
        string7.getClass();
        String string8 = context4.getResources().getString(R.string.posted_over_a_year, DateUtils.formatDateTime(context4, j, 65558 | i), string7, yyb.aY(context4, j, i));
        string8.getClass();
        return string8;
    }

    public final CharSequence z(long j) {
        return B(j, false, false, false);
    }

    public znj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public znj(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public znj(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public znj(mci mciVar, vyv vyvVar) {
        this.b = mciVar;
        this.a = vyvVar;
    }

    public znj(ahqr ahqrVar, ahpf ahpfVar) {
        ahqrVar.getClass();
        ahpfVar.getClass();
        this.b = ahqrVar;
        this.a = ahpfVar;
    }

    public znj(Context context) {
        this.b = new MediaMetadataRetriever();
        this.a = context;
    }

    public znj(armf armfVar) {
        this.b = armfVar;
        this.a = aqjn.m(new armo(zfq.a, Integer.valueOf(R.style.BugleTheme_ConversationActivity)), new armo(zfq.b, Integer.valueOf(R.style.BugleToolbarTheme)));
    }

    public znj(armf armfVar, nwj nwjVar) {
        armfVar.getClass();
        this.a = armfVar;
        this.b = nwjVar;
    }

    public znj(byte[] bArr) {
        this.b = new CopyOnWriteArraySet();
        this.a = new to();
    }

    public znj(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public znj(tqx tqxVar, Context context) {
        tqxVar.getClass();
        context.getClass();
        this.b = tqxVar;
        this.a = context;
    }

    public znj(Context context, tqx tqxVar) {
        context.getClass();
        tqxVar.getClass();
        this.a = context;
        this.b = tqxVar;
    }

    public znj(Context context, ukx ukxVar) {
        context.getClass();
        this.a = context;
        this.b = ukxVar;
    }

    public znj(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public znj(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "scheduled_send._id";
        a.c = new wsy();
        a.a();
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.c(true);
        a2.d(true);
        a2.b = new vtc(20);
        a2.a = "scheduled_send.message_id";
        a2.c = new wsy();
        a2.a();
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new wso(0);
        a3.a = "scheduled_send.conversation_id";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "scheduled_send.scheduled_time";
        a4.c = new wsy();
        this.b = new wsp(a4.a());
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.c(true);
        a5.a = "scheduled_send.status";
        a5.c = new wsy();
        a5.a();
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.i(true);
        a6.a = "scheduled_send.creation_time";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 2;
        a7.j(true);
        a7.f(true);
        a7.c(true);
        a7.a = "messages._id";
        a7.c = new wsy();
        this.a = new wsp(a7.a());
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
        a9.d(true);
        a9.a = "messages.sender_id";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "messages.sender_send_destination";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "messages.msisdn_receiving_rcs_message";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.a = "messages.receiving_network_country";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 1;
        a13.c(true);
        a13.a = "messages.sent_timestamp";
        a13.c = new wsy();
        a13.a();
        agmi a14 = agmk.a();
        a14.d = 1;
        a14.a = "messages.queue_insert_timestamp";
        a14.c = new wsy();
        a14.a();
        agmi a15 = agmk.a();
        a15.d = 1;
        a15.c(true);
        a15.a = "messages.received_timestamp";
        a15.c = new wsy();
        a15.a();
        agmi a16 = agmk.a();
        a16.d = 1;
        a16.a = "messages.message_protocol";
        a16.c = new wsy();
        a16.a();
        agmi a17 = agmk.a();
        a17.d = 1;
        a17.c(true);
        a17.a = "messages.message_status";
        a17.c = new wsy();
        a17.a();
        agmi a18 = agmk.a();
        a18.d = 1;
        a18.a = "messages.message_report_status";
        a18.c = new wsy();
        a18.a();
        agmi a19 = agmk.a();
        a19.d = 1;
        a19.c(true);
        a19.a = "messages.seen";
        a19.e(true);
        a19.c = new wsy();
        a19.a();
        agmi a20 = agmk.a();
        a20.d = 1;
        a20.c(true);
        a20.a = "messages.read";
        a20.c = new wsy();
        a20.a();
        agmi a21 = agmk.a();
        a21.d = 4;
        a21.c(true);
        a21.a = "messages.sms_message_uri";
        a21.c = new wsy();
        a21.a();
        agmi a22 = agmk.a();
        a22.d = 1;
        a22.a = "messages.sms_priority";
        a22.c = new wsy();
        a22.a();
        agmi a23 = agmk.a();
        a23.d = 1;
        a23.a = "messages.sms_message_size";
        a23.c = new wsy();
        a23.a();
        agmi a24 = agmk.a();
        a24.d = 4;
        a24.a = "messages.mms_subject";
        a24.c = new wsy();
        a24.a();
        agmi a25 = agmk.a();
        a25.d = 4;
        a25.a = "messages.mms_transaction_id";
        a25.c = new wsy();
        a25.a();
        agmi a26 = agmk.a();
        a26.d = 4;
        a26.a = "messages.mms_content_location";
        a26.c = new wsy();
        a26.a();
        agmi a27 = agmk.a();
        a27.d = 1;
        a27.a = "messages.mms_expiry";
        a27.c = new wsy();
        a27.a();
        agmi a28 = agmk.a();
        a28.d = 1;
        a28.c(true);
        a28.a = "messages.rcs_expiry";
        a28.c = new wsy();
        a28.a();
        agmi a29 = agmk.a();
        a29.d = 4;
        a29.a = "messages.mms_retrieve_text";
        a29.c = new wsy();
        a29.a();
        agmi a30 = agmk.a();
        a30.d = 1;
        a30.a = "messages.raw_status";
        a30.c = new wsy();
        a30.a();
        agmi a31 = agmk.a();
        a31.d = 1;
        a31.c(true);
        a31.d(true);
        a31.a = "messages.self_id";
        a31.c = new wsy();
        a31.a();
        agmi a32 = agmk.a();
        a32.d = 4;
        a32.c(true);
        a32.d(true);
        a32.b = new wso(1);
        a32.a = "messages.my_identity_foreign_key";
        a32.c = new wsy();
        a32.a();
        agmi a33 = agmk.a();
        a33.d = 1;
        a33.a = "messages.retry_start_timestamp";
        a33.c = new wsy();
        a33.a();
        agmi a34 = agmk.a();
        a34.d = 4;
        a34.c(true);
        a34.a = "messages.cloud_sync_id";
        a34.c = new wsy();
        a34.a();
        agmi a35 = agmk.a();
        a35.d = 4;
        a35.c(true);
        a35.a = "messages.rcs_message_id_with_text_type";
        a35.e(true);
        a35.c = new wsy();
        a35.a();
        agmi a36 = agmk.a();
        a36.d = 1;
        a36.a = "messages.etouffee_status";
        a36.c = new wsy();
        a36.a();
        agmi a37 = agmk.a();
        a37.d = 1;
        a37.a = "messages.verification_status";
        a37.c = new wsy();
        a37.a();
        agmi a38 = agmk.a();
        a38.d = 1;
        a38.a = "messages.rcs_ui_status";
        a38.c = new wsy();
        a38.a();
        agmi a39 = agmk.a();
        a39.d = 1;
        a39.c(true);
        a39.a = "messages.is_hidden";
        a39.c = new wsy();
        a39.a();
        agmi a40 = agmk.a();
        a40.d = 7;
        a40.a = "messages.rcs_remote_instance";
        a40.c = new wsy();
        a40.a();
        agmi a41 = agmk.a();
        a41.d = 1;
        a41.a = "messages.rcs_file_transfer_session_id";
        a41.c = new wsy();
        a41.a();
        agmi a42 = agmk.a();
        a42.d = 1;
        a42.a = "messages.sms_error_code";
        a42.c = new wsy();
        a42.a();
        agmi a43 = agmk.a();
        a43.d = 4;
        a43.a = "messages.sms_error_desc_map_name";
        a43.c = new wsy();
        a43.a();
        agmi a44 = agmk.a();
        a44.d = 4;
        a44.a = "messages.correlation_id";
        a44.c = new wsy();
        a44.a();
        agmi a45 = agmk.a();
        a45.d = 4;
        a45.j(true);
        a45.c(true);
        a45.a = "messages.cms_id";
        a45.e(true);
        a45.c = new wsy();
        a45.a();
        agmi a46 = agmk.a();
        a46.d = 2;
        a46.a = "messages.cms_last_mod_seq";
        a46.c = new wsy();
        a46.a();
        agmi a47 = agmk.a();
        a47.d = 4;
        a47.c(true);
        a47.a = "messages.web_id";
        a47.c = new wsy();
        a47.a();
        agmi a48 = agmk.a();
        a48.d = 1;
        a48.a = "messages.usage_stats_logging_id";
        a48.c = new wsy();
        a48.a();
        agmi a49 = agmk.a();
        a49.d = 1;
        a49.a = "messages.send_counter";
        a49.c = new wsy();
        a49.a();
        agmi a50 = agmk.a();
        a50.d = 4;
        a50.c(true);
        a50.a = "messages.original_rcs_message_id";
        a50.c = new wsy();
        a50.a();
        agmi a51 = agmk.a();
        a51.d = 4;
        a51.a = "messages.custom_delivery_receipt_mime_type";
        a51.c = new wsy();
        a51.a();
        agmi a52 = agmk.a();
        a52.d = 5;
        a52.a = "messages.custom_delivery_receipt_content";
        a52.c = new wsy();
        a52.a();
        agmi a53 = agmk.a();
        a53.d = 1;
        a53.a = "messages.report_attempt_acounter";
        a53.c = new wsy();
        a53.a();
        agmi a54 = agmk.a();
        a54.d = 5;
        a54.a = "messages.custom_headers";
        a54.c = new wsy();
        a54.a();
        agmi a55 = agmk.a();
        a55.d = 4;
        a55.j(true);
        a55.c(true);
        a55.a = "messages.cms_correlation_id";
        a55.e(true);
        a55.c = new wsy();
        a55.a();
        agmi a56 = agmk.a();
        a56.d = 1;
        a56.c(true);
        a56.d(true);
        a56.b = new wso(2);
        a56.a = "messages.group_private_participant";
        a56.c = new wsy();
        a56.a();
        agmi a57 = agmk.a();
        a57.d = 1;
        a57.c(true);
        a57.d(true);
        a57.b = new wso(3);
        a57.a = "messages.original_message_id";
        a57.c = new wsy();
        a57.a();
        agmi a58 = agmk.a();
        a58.d = 1;
        a58.a = "messages.awaiting_reverse_sync";
        a58.c = new wsy();
        a58.a();
        agmi a59 = agmk.a();
        a59.d = 4;
        a59.a = "messages.old_sms_message_uri";
        a59.c = new wsy();
        a59.a();
        agmi a60 = agmk.a();
        a60.d = 4;
        a60.j(true);
        a60.c(true);
        a60.a = "messages.draft_id";
        a60.e(true);
        a60.c = new wsy();
        a60.a();
        agmi a61 = agmk.a();
        a61.d = 1;
        a61.a = "messages.result_code";
        a61.c = new wsy();
        a61.a();
        agmi a62 = agmk.a();
        a62.d = 1;
        a62.a = "messages.cms_life_cycle";
        a62.c = new wsy();
        a62.a();
        agmi a63 = agmk.a();
        a63.d = 1;
        a63.a = "messages.fallback_reason";
        a63.c = new wsy();
        a63.a();
        agmi a64 = agmk.a();
        a64.d = 1;
        a64.a = "messages.auto_retry_counter";
        a64.c = new wsy();
        a64.a();
        agmi a65 = agmk.a();
        a65.d = 2;
        a65.a = "messages.can_revoke_before_delivered_with_rcs";
        a65.c = new wsy();
        a65.a();
        agmi a66 = agmk.a();
        a66.d = 5;
        a66.a = "messages.trace_id";
        a66.c = new wsy();
        a66.a();
        agmi a67 = agmk.a();
        a67.d = 1;
        a67.a = "messages.outgoing_delivery_report_status";
        a67.c = new wsy();
        a67.a();
        agmi a68 = agmk.a();
        a68.d = 1;
        a68.a = "messages.outgoing_read_report_status";
        a68.c = new wsy();
        a68.a();
        agmi a69 = agmk.a();
        a69.d = 1;
        a69.a = "messages.xms_transport";
        a69.c = new wsy();
        a69.a();
        agmi a70 = agmk.a();
        a70.d = 1;
        a70.a = "messages.message_original_protocol";
        a70.c = new wsy();
        a70.a();
        agmi a71 = agmk.a();
        a71.d = 4;
        a71.j(true);
        a71.c(true);
        a71.a = "messages.satellite_datagram_id";
        a71.e(true);
        a71.c = new wsy();
        a71.a();
        agmi a72 = agmk.a();
        a72.d = 1;
        a72.a = "messages.encryption_protocol";
        a72.c = new wsy();
        a72.a();
        agmi a73 = agmk.a();
        a73.d = 4;
        a73.j(true);
        a73.c(true);
        a73.a = "messages.message_persistence_id";
        a73.e(true);
        a73.c = new wsy();
        a73.a();
        agmi a74 = agmk.a();
        a74.d = 2;
        a74.j(true);
        a74.f(true);
        a74.c(true);
        a74.a = "parts._id";
        a74.c = new wsy();
        a74.a();
        agmi a75 = agmk.a();
        a75.d = 1;
        a75.c(true);
        a75.d(true);
        a75.a = "parts.message_id";
        a75.c = new wsy();
        a75.a();
        agmi a76 = agmk.a();
        a76.d = 4;
        a76.a = "parts.text";
        a76.c = new wsy();
        a76.a();
        agmi a77 = agmk.a();
        a77.d = 4;
        a77.a = "parts.uri";
        a77.c = new wsy();
        a77.a();
        agmi a78 = agmk.a();
        a78.d = 4;
        a78.c(true);
        a78.a = "parts.content_type";
        a78.c = new wsy();
        a78.a();
        agmi a79 = agmk.a();
        a79.d = 4;
        a79.a = "parts.original_uri";
        a79.c = new wsy();
        a79.a();
        agmi a80 = agmk.a();
        a80.d = 4;
        a80.a = "parts.storage_uri";
        a80.c = new wsy();
        a80.a();
        agmi a81 = agmk.a();
        a81.d = 1;
        a81.a = "parts.width";
        a81.c = new wsy();
        a81.a();
        agmi a82 = agmk.a();
        a82.d = 1;
        a82.a = "parts.height";
        a82.c = new wsy();
        a82.a();
        agmi a83 = agmk.a();
        a83.d = 1;
        a83.a = "parts.timestamp";
        a83.c = new wsy();
        a83.a();
        agmi a84 = agmk.a();
        a84.d = 4;
        a84.c(true);
        a84.a = "parts.output_uri";
        a84.c = new wsy();
        a84.a();
        agmi a85 = agmk.a();
        a85.d = 1;
        a85.a = "parts.target_size";
        a85.c = new wsy();
        a85.a();
        agmi a86 = agmk.a();
        a86.d = 1;
        a86.a = "parts.processing_status";
        a86.c = new wsy();
        a86.a();
        agmi a87 = agmk.a();
        a87.d = 1;
        a87.a = "parts.cms_attachment_processing_status";
        a87.c = new wsy();
        a87.a();
        agmi a88 = agmk.a();
        a88.d = 1;
        a88.c(true);
        a88.d(true);
        a88.a = "parts.conversation_id";
        a88.c = new wsy();
        a88.a();
        agmi a89 = agmk.a();
        a89.d = 1;
        a89.a = "parts.sticker_set_id";
        a89.c = new wsy();
        a89.a();
        agmi a90 = agmk.a();
        a90.d = 1;
        a90.a = "parts.sticker_id";
        a90.c = new wsy();
        a90.a();
        agmi a91 = agmk.a();
        a91.d = 1;
        a91.a = "parts.media_modified_timestamp";
        a91.c = new wsy();
        a91.a();
        agmi a92 = agmk.a();
        a92.d = 3;
        a92.a = "parts.longitude";
        a92.c = new wsy();
        a92.a();
        agmi a93 = agmk.a();
        a93.d = 3;
        a93.a = "parts.latitude";
        a93.c = new wsy();
        a93.a();
        agmi a94 = agmk.a();
        a94.d = 4;
        a94.a = "parts.preview_content_uri";
        a94.c = new wsy();
        a94.a();
        agmi a95 = agmk.a();
        a95.d = 4;
        a95.c(true);
        a95.a = "parts.preview_content_type";
        a95.c = new wsy();
        a95.a();
        agmi a96 = agmk.a();
        a96.d = 4;
        a96.a = "parts.fallback_uri";
        a96.c = new wsy();
        a96.a();
        agmi a97 = agmk.a();
        a97.d = 1;
        a97.a = "parts.source";
        a97.c = new wsy();
        a97.a();
        agmi a98 = agmk.a();
        a98.d = 1;
        a98.a = "parts.bundle_index";
        a98.c = new wsy();
        a98.a();
        agmi a99 = agmk.a();
        a99.d = 4;
        a99.a = "parts.blob_id";
        a99.c = new wsy();
        a99.a();
        agmi a100 = agmk.a();
        a100.d = 4;
        a100.a = "parts.blob_gaia_email";
        a100.c = new wsy();
        a100.a();
        agmi a101 = agmk.a();
        a101.d = 4;
        a101.a = "parts.cms_full_size_blob_id";
        a101.c = new wsy();
        a101.a();
        agmi a102 = agmk.a();
        a102.d = 5;
        a102.a = "parts.cms_media_encryption_key";
        a102.c = new wsy();
        a102.a();
        agmi a103 = agmk.a();
        a103.d = 5;
        a103.a = "parts.cms_compressed_media_encryption_key";
        a103.c = new wsy();
        a103.a();
        agmi a104 = agmk.a();
        a104.d = 1;
        a104.a = "parts.blob_upload_permanent_failure";
        a104.c = new wsy();
        a104.a();
        agmi a105 = agmk.a();
        a105.d = 1;
        a105.a = "parts.blob_upload_timestamp";
        a105.c = new wsy();
        a105.a();
        agmi a106 = agmk.a();
        a106.d = 4;
        a106.a = "parts.expressive_sticker_name";
        a106.c = new wsy();
        a106.a();
        agmi a107 = agmk.a();
        a107.d = 4;
        a107.a = "parts.file_name";
        a107.c = new wsy();
        a107.a();
        agmi a108 = agmk.a();
        a108.d = 1;
        a108.a = "parts.duration";
        a108.c = new wsy();
        a108.a();
        agmi a109 = agmk.a();
        a109.d = 4;
        a109.a = "parts.compressed_blob_id";
        a109.c = new wsy();
        a109.a();
        agmi a110 = agmk.a();
        a110.d = 4;
        a110.a = "parts.cms_compressed_blob_id";
        a110.c = new wsy();
        a110.a();
        agmi a111 = agmk.a();
        a111.d = 1;
        a111.a = "parts.compressed_blob_upload_permanent_failure";
        a111.c = new wsy();
        a111.a();
        agmi a112 = agmk.a();
        a112.d = 1;
        a112.a = "parts.compressed_blob_upload_timestamp";
        a112.c = new wsy();
        a112.a();
        agmi a113 = agmk.a();
        a113.d = 5;
        a113.a = "parts.media_encryption_key";
        a113.c = new wsy();
        a113.a();
        agmi a114 = agmk.a();
        a114.d = 5;
        a114.a = "parts.compressed_media_encryption_key";
        a114.c = new wsy();
        a114.a();
        agmi a115 = agmk.a();
        a115.d = 1;
        a115.a = "parts.missing_entry_in_telephony";
        a115.c = new wsy();
        a115.a();
        agmi a116 = agmk.a();
        a116.d = 1;
        a116.a = "parts.awaiting_reverse_sync";
        a116.c = new wsy();
        a116.a();
        agmi a117 = agmk.a();
        a117.d = 1;
        a117.a = "parts.file_size_bytes";
        a117.c = new wsy();
        a117.a();
        agmi a118 = agmk.a();
        a118.d = 4;
        a118.c(true);
        a118.a = "parts.local_cache_path";
        a118.c = new wsy();
        a118.a();
        agmi a119 = agmk.a();
        a119.d = 1;
        a119.a = "parts.media_send_type";
        a119.c = new wsy();
        a119.a();
        agmi a120 = agmk.a();
        a120.d = 5;
        a120.a = "parts.voice_metadata";
        a120.c = new wsy();
        a120.a();
        agmi a121 = agmk.a();
        a121.d = 1;
        a121.a = "parts.validation_status";
        a121.c = new wsy();
        a121.a();
        agmi a122 = agmk.a();
        a122.d = 4;
        a122.a = "parts.processing_id";
        a122.c = new wsy();
        a122.a();
        agmi a123 = agmk.a();
        a123.d = 1;
        a123.a = "parts.rich_card_media_download_failure_reason";
        a123.c = new wsy();
        a123.a();
        agmi a124 = agmk.a();
        a124.d = 1;
        a124.a = "parts.image_display_state";
        a124.c = new wsy();
        a124.a();
        agmi a125 = agmk.a();
        a125.d = 8;
        a125.a = "parts__ROWID";
        a125.c = new wsy();
        a125.a();
        agmi a126 = agmk.a();
        a126.d = 4;
        a126.a = "message_captions.caption";
        a126.c = new wsy();
        a126.a();
        agmi a127 = agmk.a();
        a127.d = 2;
        a127.j(true);
        a127.c(true);
        a127.d(true);
        a127.b = new vtc(19);
        a127.a = "message_captions.message_id";
        a127.e(true);
        a127.c = new wsy();
        a127.a();
    }

    public znj(armf armfVar, armf armfVar2, short[] sArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public znj(znh znhVar) {
        this.a = znhVar;
        arml b = armd.b(3, new zni(new zni(znhVar, 1), 0));
        int i = arsc.a;
        this.b = new eot(new arrh(znz.class), new zni(b, 2), new zdh(znhVar, b, 11, null), new zni(b, 3));
    }

    public znj(armf armfVar, alhz alhzVar) {
        this.b = armfVar;
        this.a = new alhp(alhzVar);
    }

    public znj(armf armfVar, armf armfVar2, ymh ymhVar) {
        armfVar.getClass();
        armfVar2.getClass();
        ymhVar.getClass();
        this.a = armfVar;
        this.b = armfVar2;
    }

    public znj(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        this.a = ": ";
    }

    public znj(Context context, armf armfVar) {
        context.getClass();
        armfVar.getClass();
        this.a = context;
        this.b = armfVar;
    }

    public znj(armf armfVar, arpi arpiVar) {
        armfVar.getClass();
        arpiVar.getClass();
        this.b = arpiVar;
        znj znjVar = (znj) armfVar.b();
        aiwl a = wus.a();
        a.i(wuk.CROSS_COUNTRY_HIDING_SETTINGS);
        a.k(yqu.a);
        this.a = znjVar.ab(a.f());
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar;
        this.b = armfVar2;
    }

    public znj(armf armfVar, armf armfVar2, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [asai, java.lang.Object] */
    public znj(arwe arweVar, ifq ifqVar, zas zasVar, zai zaiVar, Optional optional, zen zenVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        ifqVar.getClass();
        zasVar.getClass();
        zaiVar.getClass();
        zenVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.b = arweVar;
        asai[] asaiVarArr = new asai[6];
        akul c = ifqVar.c();
        c.getClass();
        asaiVarArr[0] = twd.c(c).a();
        asaiVarArr[1] = new lhh(zasVar.h, 11);
        asaiVarArr[2] = zaiVar.c;
        optional.isPresent();
        asaiVarArr[3] = ascy.a(null);
        asaiVarArr[4] = ((osb) armfVar2.b()).a() ? ((zdo) armfVar.b()).i : ascy.a(arnv.a);
        asaiVarArr[5] = zenVar.e;
        qkk qkkVar = new qkk(asaiVarArr, this, 7);
        int i = ascp.a;
        ascp a = asco.a(0L, 3);
        int i2 = alog.d;
        alog alogVar = alsx.a;
        alogVar.getClass();
        this.a = arrn.T(qkkVar, arweVar, a, new yzz(alogVar));
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public znj() {
        ascd a = ascy.a("");
        this.a = a;
        this.b = new zdw(a, new yyy(this, 15));
    }

    public znj(yyt yytVar) {
        this.a = yytVar;
        this.b = new ConcurrentHashMap();
    }

    public znj(Context context, yjy yjyVar) {
        context.getClass();
        yjyVar.getClass();
        this.a = context;
        this.b = yjyVar;
    }

    public znj(armf armfVar, armf armfVar2, wwn wwnVar) {
        armfVar.getClass();
        armfVar2.getClass();
        wwnVar.getClass();
        this.b = armfVar2;
        this.a = wwnVar;
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public znj(nxc nxcVar, armf armfVar) {
        armfVar.getClass();
        this.a = nxcVar;
        this.b = armfVar;
    }

    public znj(aogy aogyVar, arwe arweVar, char[] cArr) {
        aogyVar.getClass();
        this.a = aogyVar;
        this.b = arweVar;
    }

    public znj(aogy aogyVar, arwe arweVar, byte[] bArr) {
        aogyVar.getClass();
        this.a = aogyVar;
        this.b = arweVar;
    }

    public znj(String str, boolean z) {
        this.a = uuh.i(uuh.b, str.concat("_heuristric_enabled"), true);
        this.b = uuh.i(uuh.b, str.concat("_heuristic_ignored"), z);
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr, char[] cArr, byte[] bArr2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.a = armfVar2;
    }

    public znj(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        this.b = armd.a(new vnq(this, 11));
    }

    public znj(armf armfVar, armf armfVar2, int[] iArr) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar;
        this.b = armfVar2;
    }

    public znj(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public znj(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public znj(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public znj(byte[] bArr, byte[] bArr2) {
        this.b = new xxo();
        this.a = new Object();
    }

    public znj(Context context, xnv xnvVar, byte[] bArr) {
        context.getClass();
        xnvVar.getClass();
        this.a = context;
        this.b = xnvVar;
    }
}
