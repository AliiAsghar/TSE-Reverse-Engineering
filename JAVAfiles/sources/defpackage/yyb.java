package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bwj;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.LongConsumer$CC;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yyb {
    public static volatile Context b;

    public yyb() {
    }

    public static Integer A(amzp amzpVar, int i, Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue() + 1;
        } else {
            i2 = 0;
        }
        if ((((Boolean) yrp.c.e()).booleanValue() || amzpVar != amzp.SPAM) && ((aplf) yrp.a.e()).b.size() > i2) {
            if (((Boolean) ((utz) yrp.d.get()).e()).booleanValue() && i == 14) {
                return null;
            }
            return Integer.valueOf(((aplf) yrp.a.e()).b.d(i2));
        }
        return null;
    }

    public static ypk B(int i) {
        int av = a.av(i);
        if (av != 2) {
            if (av != 8) {
                if (av != 4) {
                    if (av != 5) {
                        return ypk.a;
                    }
                    return ypk.b;
                }
                return ypk.c;
            }
            return ypk.b;
        }
        return ypk.c;
    }

    public static /* synthetic */ Integer C(amzp amzpVar, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        return A(amzpVar, 0, num);
    }

    public static ypn D(MessageCoreData messageCoreData) {
        String am;
        messageCoreData.getClass();
        ypm F = F(messageCoreData);
        if (((Boolean) ymd.r.e()).booleanValue()) {
            am = messageCoreData.au();
        } else {
            am = messageCoreData.am();
        }
        return new ypn(F, am);
    }

    public static ypm E(MessagesTable.BindData bindData) {
        boolean z;
        MessageIdType A = bindData.A();
        A.getClass();
        ConversationIdType z2 = bindData.z();
        z2.getClass();
        int k = bindData.k();
        boolean y = d.y(bindData.q());
        boolean w = rvx.w(bindData.q());
        String P = bindData.P();
        if (bindData.m() == 2) {
            z = true;
        } else {
            z = false;
        }
        return new ypm(A, z2, k, y, w, P, z, bindData.t());
    }

    public static ypm F(MessageCoreData messageCoreData) {
        MessageIdType B = messageCoreData.B();
        B.getClass();
        ConversationIdType z = messageCoreData.z();
        z.getClass();
        return new ypm(B, z, messageCoreData.d(), messageCoreData.cv(), messageCoreData.cD(), messageCoreData.aw(), messageCoreData.cn(), messageCoreData.n());
    }

    public static ypj G(int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        arpx arpxVar = ypi.m;
        ArrayList<ypi> arrayList = new ArrayList();
        arng arngVar = new arng(arpxVar);
        while (arngVar.hasNext()) {
            Object next = arngVar.next();
            if (((ypi) next) != ypi.a) {
                arrayList.add(next);
            }
        }
        for (ypi ypiVar : arrayList) {
            if ((ypiVar.l & i) != 0) {
                linkedHashSet.add(ypiVar);
            }
        }
        return new ypj(linkedHashSet);
    }

    public static ypi H(int i) {
        arng arngVar = new arng(ypi.m);
        while (arngVar.hasNext()) {
            ypi ypiVar = (ypi) arngVar.next();
            if (ypiVar.l == i) {
                return ypiVar;
            }
        }
        return ypi.a;
    }

    public static ypi I(int i) {
        switch (i - 2) {
            case 0:
                return ypi.a;
            case 1:
                return ypi.c;
            case 2:
                return ypi.e;
            case 3:
                return ypi.d;
            case 4:
                return ypi.f;
            case 5:
                return ypi.g;
            case 6:
                return ypi.h;
            case 7:
                return ypi.i;
            case 8:
                return ypi.j;
            case 9:
                return ypi.k;
            default:
                return ypi.a;
        }
    }

    public static ype J() {
        return new ype(amzp.NO_VERDICT, ypk.a, null, null, null, 28);
    }

    public static akrh K() {
        throw new UnsupportedOperationException("Reclassification spam is not supported for this spam protection type.");
    }

    public static /* synthetic */ Object L() {
        throw new UnsupportedOperationException("Reclassification spam is not supported for this spam protection type.");
    }

    public static aozb M(String str) {
        str.getClass();
        UUID fromString = UUID.fromString(str);
        return aozb.w(ByteBuffer.allocate(16).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).array());
    }

    public static amzh N(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return amzh.UNKNOWN_CONVERSATION_PROTOCOL;
                }
                return amzh.RCS;
            }
            return amzh.MMS;
        }
        return amzh.SMS;
    }

    public static amzr O(amgg amggVar) {
        int ordinal = amggVar.ordinal();
        if (ordinal != 16) {
            switch (ordinal) {
                case 2:
                case 6:
                case 9:
                case 10:
                    return amzr.SHORT_CODE;
                case 3:
                    return amzr.EMAIL;
                case 4:
                case 11:
                case 12:
                case 13:
                    return amzr.LONG_CODE;
                case 5:
                    break;
                case 7:
                case 8:
                    return amzr.ALPHA_CODE;
                default:
                    return amzr.UNKNOWN_DESTINATION_TYPE;
            }
        }
        return amzr.BOT;
    }

    public static /* synthetic */ ymu P(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ymu) s;
    }

    public static void Q(apzk apzkVar, aozy aozyVar) {
        apzkVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymu ymuVar = (ymu) aozyVar.b;
        ymu ymuVar2 = ymu.a;
        ymuVar.c = apzkVar.a();
    }

    public static /* synthetic */ void R(ymb ymbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymu ymuVar = (ymu) aozyVar.b;
        ymu ymuVar2 = ymu.a;
        apax apaxVar = ymuVar.e;
        if (!apaxVar.c()) {
            ymuVar.e = apag.mutableCopy(apaxVar);
        }
        ymuVar.e.add(ymbVar);
    }

    public static /* synthetic */ void S(ymj ymjVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymu ymuVar = (ymu) aozyVar.b;
        ymu ymuVar2 = ymu.a;
        apax apaxVar = ymuVar.b;
        if (!apaxVar.c()) {
            ymuVar.b = apag.mutableCopy(apaxVar);
        }
        ymuVar.b.add(ymjVar);
    }

    public static xze V() {
        return (xze) ymt.e.a();
    }

    public static utz W() {
        Object a = ymt.c.a();
        a.getClass();
        return (utz) a;
    }

    public static utz X() {
        Object a = ymt.d.a();
        a.getClass();
        return (utz) a;
    }

    public static /* synthetic */ void Y(ymu ymuVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymq ymqVar = (ymq) aozyVar.b;
        ymq ymqVar2 = ymq.a;
        apax apaxVar = ymqVar.c;
        if (!apaxVar.c()) {
            ymqVar.c = apag.mutableCopy(apaxVar);
        }
        ymqVar.c.add(ymuVar);
    }

    public static boolean a(yyf yyfVar) {
        tqc tqcVar;
        if (yyfVar != null && yyfVar.b && (tqcVar = yyfVar.a) != null && tqcVar.g()) {
            return true;
        }
        return false;
    }

    public static akul aA(SuggestionData suggestionData, amhh amhhVar, aqax aqaxVar) {
        suggestionData.getClass();
        amhhVar.getClass();
        aqaxVar.getClass();
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    public static Object aB() {
        return arnb.a;
    }

    public static String aC(MessageCoreData messageCoreData) {
        String format = String.format(Locale.US, "%019d", Arrays.copyOf(new Object[]{Long.valueOf(messageCoreData.s())}, 1));
        format.getClass();
        return format;
    }

    public static boolean aD() {
        if (!albo.ar("GOOGLE", Build.MANUFACTURER) && !albo.ar("GOOGLE", Build.BRAND)) {
            return false;
        }
        return true;
    }

    public static boolean aE() {
        if (!albo.ar("HUAWEI", Build.MANUFACTURER) && !albo.ar("HONOR", Build.MANUFACTURER) && !albo.ar("HUAWEI", Build.BRAND) && !albo.ar("HONOR", Build.BRAND)) {
            return false;
        }
        return true;
    }

    public static boolean aF() {
        if (!albo.ar("LGE", Build.MANUFACTURER) && !albo.ar("LGE", Build.BRAND)) {
            return false;
        }
        return true;
    }

    public static boolean aG() {
        if (!albo.ar("SAMSUNG", Build.MANUFACTURER) && !albo.ar("SAMSUNG", Build.BRAND)) {
            return false;
        }
        return true;
    }

    public static akul aH() {
        int i = alog.d;
        return aktp.ag(alsx.a);
    }

    public static /* synthetic */ String aI(int i) {
        if (i != 2) {
            return "RESOURCE_ID";
        }
        return "FILE_PATH";
    }

    public static void aJ(yga ygaVar) {
        ygaVar.a();
    }

    public static yga aK(yga... ygaVarArr) {
        if (ygaVarArr.length == 1) {
            return ygaVarArr[0];
        }
        return new yfy(aqil.c(ygaVarArr));
    }

    public static Object aL(Class cls) {
        Context context = b;
        context.getClass();
        return akec.w(context, cls);
    }

    public static int aM(double d) {
        return (int) ((d * 4.294967295E9d) - 2.147483648E9d);
    }

    public static akul aN(akul akulVar) {
        return akulVar.h(new xqp(20), andi.a);
    }

    @Deprecated
    public static void aO(ListenableFuture listenableFuture, String str, String str2) {
        aktp.aa(listenableFuture, new aktn(str, str2, 1), andi.a);
    }

    public static boolean aP(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && arsd.z(scheme, "http", true)) {
            return true;
        }
        return false;
    }

    public static int aQ(String str) {
        if (gh.m(str)) {
            return 4;
        }
        if (gh.z(str)) {
            return 5;
        }
        if (gh.e(str)) {
            return 6;
        }
        if (gh.y(str)) {
            return 7;
        }
        if (gh.w(str)) {
            return 3;
        }
        if (gh.q(str)) {
            return 8;
        }
        if (gh.f(str)) {
            return 9;
        }
        if (gh.x(str)) {
            return 13;
        }
        if (gh.g(str)) {
            return 10;
        }
        if (gh.r(str)) {
            return 11;
        }
        if (gh.A(str)) {
            return 12;
        }
        if (!gh.k(str)) {
            if (!"application/vnd.android.package-archive".equals(str) && !"application/zip".equals(str) && !"application/java-archive".equals(str)) {
                return 2;
            }
            return 15;
        }
        return 14;
    }

    public static int aR(long j) {
        if (j <= 0) {
            return 2;
        }
        if (j < 10240) {
            return 3;
        }
        if (j < 102400) {
            return 4;
        }
        if (j < 512000) {
            return 5;
        }
        if (j < 1048576) {
            return 6;
        }
        if (j < 5242880) {
            return 8;
        }
        if (j < 10485760) {
            return 9;
        }
        return 10;
    }

    public static Object aS(Optional optional) {
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public static boolean aT(int i) {
        if (i != 6 && i != 8 && i != 5 && i != 7) {
            return false;
        }
        return true;
    }

    public static void aU(File file) {
        if (file.exists()) {
            file.setReadable(true, false);
        }
    }

    public static long aV(long j, long j2, ZoneId zoneId) {
        zoneId.getClass();
        return Math.abs(ChronoUnit.DAYS.between(Instant.ofEpochMilli(j).atZone(zoneId).b(), Instant.ofEpochMilli(j2).atZone(zoneId).b()));
    }

    public static CharSequence aW(long j, int i, String str, String str2) {
        SimpleDateFormat simpleDateFormat;
        if ((i & 128) == 128) {
            simpleDateFormat = new SimpleDateFormat(str);
        } else {
            simpleDateFormat = new SimpleDateFormat(str2);
        }
        String format = simpleDateFormat.format(Long.valueOf(j));
        format.getClass();
        return format;
    }

    public static CharSequence aX(Context context, long j, Locale locale, boolean z, int i) {
        context.getClass();
        locale.getClass();
        if (z) {
            if (d.F(locale, Locale.US)) {
                return aW(j, i, "M/d/yy", "M/d/yy");
            }
            String formatDateTime = DateUtils.formatDateTime(context, j, 131092);
            formatDateTime.getClass();
            return formatDateTime;
        }
        if (d.F(locale, Locale.US)) {
            return aW(j, i, "M/d/yy, HH:mm", "M/d/yy, h:mm aa");
        }
        String formatDateTime2 = DateUtils.formatDateTime(context, j, 131093 | i);
        formatDateTime2.getClass();
        return formatDateTime2;
    }

    public static CharSequence aY(Context context, long j, int i) {
        String formatDateTime = DateUtils.formatDateTime(context, j, i | 1);
        formatDateTime.getClass();
        return formatDateTime;
    }

    public static int aZ() {
        sjk a = sjm.a();
        a.w("getContactCount");
        a.s();
        int i = 0;
        a.n(new agpk("COUNT(distinct $V)", new Object[]{sjm.e.o}), "count");
        agmq n = a.b().n();
        try {
            sjh sjhVar = (sjh) n;
            if (sjhVar.moveToNext()) {
                String cX = sjhVar.cX("count");
                cX.getClass();
                i = Integer.parseInt(cX);
            }
            armd.i(n, null);
            return i;
        } finally {
        }
    }

    public static /* synthetic */ ymj aa(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ymj) s;
    }

    public static void ab(amzp amzpVar, aozy aozyVar) {
        amzpVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymj ymjVar = (ymj) aozyVar.b;
        ymj ymjVar2 = ymj.a;
        ymjVar.d = amzpVar.a();
    }

    public static void ac(float f, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymj ymjVar = (ymj) aozyVar.b;
        ymj ymjVar2 = ymj.a;
        ymjVar.c = f;
    }

    public static void ad(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymj ymjVar = (ymj) aozyVar.b;
        ymj ymjVar2 = ymj.a;
        ymjVar.b = a.ar(i);
    }

    public static ymi ae(boolean z, ConversationIdType conversationIdType, String str, ypi ypiVar, boolean z2, boolean z3, amfe amfeVar, yni yniVar, amzu amzuVar, int i, int i2, int i3) {
        ypiVar.getClass();
        amfeVar.getClass();
        if (i3 != 0) {
            return new ymi(z, conversationIdType, str, ypiVar, z2, z3, amfeVar, yniVar, amzuVar, i, i2, i3, false, null, null);
        }
        throw null;
    }

    public static /* synthetic */ ymb af(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ymb) s;
    }

    public static /* synthetic */ void ag(amzr amzrVar, aozy aozyVar) {
        amzrVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymb ymbVar = (ymb) aozyVar.b;
        apap apapVar = ymb.a;
        apao apaoVar = ymbVar.g;
        if (!apaoVar.c()) {
            ymbVar.g = apag.mutableCopy(apaoVar);
        }
        ymbVar.g.g(amzrVar.a());
    }

    public static /* synthetic */ void ah(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ymb ymbVar = (ymb) aozyVar.b;
        apap apapVar = ymb.a;
        apax apaxVar = ymbVar.d;
        if (!apaxVar.c()) {
            ymbVar.d = apag.mutableCopy(apaxVar);
        }
        ymbVar.d.add("US");
    }

    public static /* synthetic */ void ai(aozy aozyVar) {
        new apaq(((ymb) aozyVar.b).g, ymb.b);
    }

    public static void aj(aozy aozyVar) {
        DesugarCollections.unmodifiableList(((ymb) aozyVar.b).d).getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object ak(defpackage.aiwu r4, defpackage.arqr r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ylb
            if (r0 == 0) goto L13
            r0 = r6
            ylb r0 = (defpackage.ylb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ylb r0 = new ylb
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kju r5 = r0.c
            defpackage.aqil.P(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.aqil.P(r6)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.a()
            r4.getClass()
            r6 = r5
            kju r6 = (defpackage.kju) r6
            r0.c = r6
            r0.b = r3
            java.lang.Object r6 = defpackage.arro.F(r4, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r6.getClass()
            java.lang.Object r4 = r5.a(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyb.ak(aiwu, arqr, arpe):java.lang.Object");
    }

    public static Object al(aiwu aiwuVar, arqr arqrVar, arpe arpeVar) {
        return arro.F(aiwuVar.b(new yez(new wyk(arqrVar, 20), 10), andi.a), arpeVar);
    }

    public static void am() {
        System.exit(0);
    }

    public static boolean an(String str) {
        return "auto".equals(str);
    }

    public static yjz ao(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        context.getClass();
        armfVar.getClass();
        return new yjz(context, armfVar2, armfVar, armfVar3, armfVar4, armfVar5, armfVar6);
    }

    public static sxy ap(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        syc sycVar = new syc();
        sycVar.b(new ybe(14), new ybe(15));
        syc sycVar2 = new syc();
        sycVar2.S(qkv.b);
        syc sycVar3 = new syc();
        sycVar3.q(false);
        sxy d = MessagesTable.d();
        d.w("createLatestSuggestableMessageQuery");
        d.g(new yec(conversationIdType, 8));
        d.f(sycVar);
        d.f(sycVar2);
        d.f(sycVar3);
        d.h(new atkn((Object) MessagesTable.c.i, false));
        d.u(1);
        return d;
    }

    public static szr aq(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        sxy ap = ap(conversationIdType);
        szs a = szu.a();
        a.w("createSmartSuggestionsQuery");
        a.c(new yec(ap, 9));
        a.c(new ybe(12));
        a.c(new ybe(13));
        return a.b();
    }

    public static void ar(SuggestionData suggestionData, aqba aqbaVar) {
        suggestionData.getClass();
        aqbaVar.getClass();
    }

    public static yif as(SuggestionData suggestionData) {
        suggestionData.getClass();
        return yif.a;
    }

    public static akul au() {
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    public static akul av() {
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    public static Object aw() {
        return arnb.a;
    }

    public static akul ax(amgj amgjVar) {
        amgjVar.getClass();
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    public static akul ay(amgj amgjVar) {
        amgjVar.getClass();
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    public static Object az() {
        return arnb.a;
    }

    public static boolean b(yyf yyfVar) {
        if (yyfVar != null && yyfVar.b) {
            tqc tqcVar = yyfVar.a;
            if (tqcVar == null || !tqcVar.g()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String bA(boolean z, String str) {
        if (!z) {
            return str;
        }
        if (str != null && str.length() > 4) {
            xze xzeVar = xca.a;
            if (msx.g(str)) {
                return str.substring(0, 4);
            }
            return str.substring(str.length() - 4);
        }
        return str;
    }

    public static String bB(Context context) {
        return String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.ui.avatar.AvatarContentProvider");
    }

    public static boolean bC(MessagePartCoreData messagePartCoreData) {
        String authority;
        if (!messagePartCoreData.bn()) {
            return false;
        }
        Uri t = messagePartCoreData.t();
        if (t != null && (authority = t.getAuthority()) != null && !authority.startsWith("mms")) {
            return false;
        }
        return true;
    }

    public static String bD() {
        return UUID.randomUUID().toString();
    }

    public static qep bE(xrz xrzVar) {
        pwb pwbVar = new pwb();
        final aozy createBuilder = qep.a.createBuilder();
        String uri = xrzVar.d.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qep qepVar = (qep) createBuilder.b;
        uri.getClass();
        qepVar.f = uri;
        xrzVar.f.ifPresent(new LongConsumer() { // from class: xsa
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                aozy aozyVar = aozy.this;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                qep qepVar2 = (qep) aozyVar.b;
                qep qepVar3 = qep.a;
                qepVar2.d = (int) j;
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
                return LongConsumer$CC.$default$andThen(this, longConsumer);
            }
        });
        xrzVar.e.ifPresent(new xpw(createBuilder, 6));
        xrzVar.c.ifPresent(new vxb(createBuilder, pwbVar, 18));
        return (qep) createBuilder.s();
    }

    public static String bF(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.X() != null) {
            return messagePartCoreData.X();
        }
        Uri t = messagePartCoreData.t();
        Uri v = messagePartCoreData.v();
        String U = messagePartCoreData.U();
        if (v != null && !ydk.A(v)) {
            t = v;
        }
        if (t == null) {
            return null;
        }
        return actt.g(t, albo.ag(U));
    }

    public static /* synthetic */ String bG(int i) {
        if (i != 1) {
            return "WORK_QUEUE_RESULT";
        }
        return "MESSAGE_CORE_DATA";
    }

    public static amur bH(CronetException cronetException) {
        int i = 3;
        if (cronetException instanceof NetworkException) {
            aozy createBuilder = amuq.a.createBuilder();
            NetworkException networkException = (NetworkException) cronetException;
            long cronetInternalErrorCode = networkException.getCronetInternalErrorCode();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amuq amuqVar = (amuq) createBuilder.b;
            amuqVar.b |= 2;
            amuqVar.d = cronetInternalErrorCode;
            long errorCode = networkException.getErrorCode();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amuq amuqVar2 = (amuq) createBuilder.b;
            amuqVar2.b |= 1;
            amuqVar2.c = errorCode;
            boolean z = cronetException instanceof QuicException;
            if (z) {
                aozy createBuilder2 = amup.a.createBuilder();
                long quicDetailedErrorCode = ((QuicException) cronetException).getQuicDetailedErrorCode();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amup amupVar = (amup) createBuilder2.b;
                amupVar.b |= 1;
                amupVar.c = quicDetailedErrorCode;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amuq amuqVar3 = (amuq) createBuilder.b;
                amup amupVar2 = (amup) createBuilder2.s();
                amupVar2.getClass();
                amuqVar3.e = amupVar2;
                amuqVar3.b |= 4;
            }
            aozy createBuilder3 = amur.a.createBuilder();
            if (true == z) {
                i = 2;
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar = createBuilder3.b;
            amur amurVar = (amur) apagVar;
            amurVar.d = i - 1;
            amurVar.b |= 4;
            if (!apagVar.isMutable()) {
                createBuilder3.u();
            }
            amur amurVar2 = (amur) createBuilder3.b;
            amuq amuqVar4 = (amuq) createBuilder.s();
            amuqVar4.getClass();
            amurVar2.c = amuqVar4;
            amurVar2.b |= 1;
            return (amur) createBuilder3.s();
        }
        if (cronetException instanceof CallbackException) {
            aozy createBuilder4 = amur.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amur amurVar3 = (amur) createBuilder4.b;
            amurVar3.d = 3;
            amurVar3.b |= 4;
            return (amur) createBuilder4.s();
        }
        if (cronetException instanceof atef) {
            aozy createBuilder5 = amur.a.createBuilder();
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            amur amurVar4 = (amur) createBuilder5.b;
            amurVar4.d = 4;
            amurVar4.b |= 4;
            return (amur) createBuilder5.s();
        }
        aozy createBuilder6 = amur.a.createBuilder();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        amur amurVar5 = (amur) createBuilder6.b;
        amurVar5.d = 0;
        amurVar5.b |= 4;
        return (amur) createBuilder6.s();
    }

    public static apvm bI(apvm apvmVar, boolean z, armf armfVar) {
        if (z) {
            return new xsw((xyt) ((kru) ((qdq) armfVar.b()).a).a.dS.b(), apvmVar);
        }
        return apvmVar;
    }

    public static Object bJ(String str, Supplier supplier) {
        Object obj;
        akrh e = aktp.e(str);
        try {
            obj = supplier.get();
            armd.i(e, null);
            return obj;
        } finally {
        }
    }

    public static void bK(String str, Runnable runnable) {
        akrh e = aktp.e(str);
        try {
            runnable.run();
            armd.i(e, null);
        } finally {
        }
    }

    public static boolean bL(apct apctVar, apct apctVar2, apct apctVar3) {
        if (apdr.a(apctVar2, apctVar) <= 0 && apdr.a(apctVar, apctVar3) <= 0) {
            return true;
        }
        return false;
    }

    public static xlb bM(Collection collection) {
        Object next;
        xky xkyVar;
        xky xkyVar2;
        collection.getClass();
        ArrayList<xlb> arrayList = new ArrayList();
        for (Object obj : collection) {
            if (bW((xlb) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        for (xlb xlbVar : arrayList) {
            if (xlbVar.c == 5) {
                xkyVar2 = (xky) xlbVar.d;
            } else {
                xkyVar2 = xky.a;
            }
            apct apctVar = xkyVar2.d;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            arrayList2.add(apctVar);
        }
        apct apctVar2 = apds.a;
        apdr apdrVar = apdr.a;
        apdrVar.getClass();
        apct apctVar3 = (apct) aqjn.ae(arrayList2, apdrVar);
        ArrayList arrayList3 = new ArrayList(aqjn.J(arrayList, 10));
        for (xlb xlbVar2 : arrayList) {
            if (xlbVar2.c == 5) {
                xkyVar = (xky) xlbVar2.d;
            } else {
                xkyVar = xky.a;
            }
            apct apctVar4 = xkyVar.d;
            if (apctVar4 == null) {
                apctVar4 = apct.a;
            }
            arrayList3.add(apctVar4);
        }
        apdr apdrVar2 = apdr.a;
        apdrVar2.getClass();
        Iterator it = arrayList3.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (apdrVar2.compare(next, next2) > 0) {
                    next = next2;
                }
            }
        }
        apct apctVar5 = (apct) next;
        xlb xlbVar3 = (xlb) aqjn.Z(arrayList);
        if (xlbVar3 == null) {
            return null;
        }
        aozy builder = xlbVar3.toBuilder();
        builder.getClass();
        ct(builder);
        cr(builder);
        ct(builder);
        List ap = aqjn.ap(arrayList, xlbVar3);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        xlb xlbVar4 = (xlb) builder.b;
        xlbVar4.a();
        aoyj.addAll(ap, xlbVar4.h);
        aozy builder2 = ck(builder).toBuilder();
        builder2.getClass();
        if (apctVar5 == null) {
            apctVar5 = cw(builder2);
        }
        cx(apctVar5, builder2);
        if (apctVar3 == null) {
            apctVar3 = cw(builder2);
        }
        cy(apctVar3, builder2);
        co(cv(builder2), builder);
        return cl(builder);
    }

    public static xlb bN(xlb xlbVar) {
        xlbVar.getClass();
        if (!bW(xlbVar)) {
            return xlbVar;
        }
        aozy builder = xlbVar.toBuilder();
        builder.getClass();
        aozy builder2 = ck(builder).toBuilder();
        builder2.getClass();
        cx(cw(builder2), builder2);
        cy(cw(builder2), builder2);
        co(cv(builder2), builder);
        return cl(builder);
    }

    public static boolean bO(xlb xlbVar, xlb xlbVar2) {
        xky xkyVar;
        xkx xkxVar;
        xlbVar.getClass();
        xlbVar2.getClass();
        Collection<xlb> bQ = bQ(xlbVar2);
        if (bQ.isEmpty()) {
            return false;
        }
        for (xlb xlbVar3 : bQ) {
            if (xlbVar3.c == 5) {
                xkyVar = (xky) xlbVar3.d;
            } else {
                xkyVar = xky.a;
            }
            apct apctVar = xkyVar.f;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            apctVar.getClass();
            if (xlbVar.c == 4) {
                xkxVar = (xkx) xlbVar.d;
            } else {
                xkxVar = xkx.a;
            }
            apct apctVar2 = xkxVar.c;
            if (apctVar2 == null) {
                apctVar2 = apct.a;
            }
            apctVar2.getClass();
            if (apdr.a(apctVar, apctVar2) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static apct bP(apct apctVar, apct apctVar2) {
        apct apctVar3 = apds.a;
        apdr apdrVar = apdr.a;
        apdrVar.getClass();
        return (apct) arrj.s(apctVar, apctVar2, apdrVar);
    }

    public static Collection bQ(xlb xlbVar) {
        xlbVar.getClass();
        apax apaxVar = xlbVar.f;
        apaxVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : apaxVar) {
            xlb xlbVar2 = (xlb) obj;
            xlbVar2.getClass();
            if (bW(xlbVar2)) {
                arrayList.add(obj);
            }
        }
        List az = aqjn.az(arrayList);
        apax apaxVar2 = xlbVar.h;
        apaxVar2.getClass();
        az.addAll(apaxVar2);
        if (bW(xlbVar)) {
            aozy builder = xlbVar.toBuilder();
            builder.getClass();
            cu(builder);
            cs(builder);
            ct(builder);
            cr(builder);
            az.add(cl(builder));
        }
        return az;
    }

    public static boolean bR(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (bU((xlb) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean bS(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (bV((xlb) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean bT(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (bW((xlb) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean bU(xlb xlbVar) {
        xlbVar.getClass();
        if (xlbVar.c == 3) {
            return true;
        }
        return false;
    }

    public static boolean bV(xlb xlbVar) {
        xlbVar.getClass();
        if (xlbVar.c == 4) {
            return true;
        }
        return false;
    }

    public static boolean bW(xlb xlbVar) {
        xlbVar.getClass();
        if (xlbVar.c == 5) {
            return true;
        }
        return false;
    }

    public static aozb bX(UUID uuid) {
        return aozb.w(bZ(uuid));
    }

    public static UUID bY(aozb aozbVar) {
        aozbVar.getClass();
        if (((Boolean) xml.a.e()).booleanValue() && aozbVar.d() != 16) {
            throw new IllegalArgumentException("The input to UUID must have 16 bytes. It had bytes.size()=" + aozbVar.d());
        }
        ByteBuffer wrap = ByteBuffer.wrap(aozbVar.H());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public static byte[] bZ(UUID uuid) {
        byte[] array = ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        array.getClass();
        return array;
    }

    public static atok ba() {
        aozy createBuilder = atok.a.createBuilder();
        String uuid = UUID.randomUUID().toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        atok atokVar = (atok) createBuilder.b;
        uuid.getClass();
        atokVar.b = uuid;
        return (atok) createBuilder.s();
    }

    public static ExecutorService bb(String str, int i, int i2) {
        return Executors.newFixedThreadPool(i, new ahkg(str, i2, 1));
    }

    public static alvj bc(Uri uri) {
        uri.getClass();
        return new ivm(uri, 8);
    }

    public static alvj bd(CharSequence charSequence) {
        charSequence.getClass();
        return new ivm(charSequence, 7);
    }

    public static CharSequence be(CharSequence charSequence) {
        charSequence.getClass();
        String bk = bk(charSequence);
        bk.getClass();
        return bk;
    }

    public static String bf(Uri uri) {
        uri.getClass();
        if (aP(uri)) {
            return bj(uri);
        }
        String uri2 = uri.toString();
        uri2.getClass();
        return uri2;
    }

    public static String bg(ConversationIdType conversationIdType) {
        return bh(conversationIdType.toString());
    }

    public static String bh(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (Log.isLoggable("Bugle", 3)) {
            return a.bW((String) charSequence, "raw-pii[", "]");
        }
        return bk(charSequence);
    }

    public static String bi(msh mshVar) {
        return bh(mshVar.toString());
    }

    public static String bj(Uri uri) {
        String ambjVar;
        String path = uri.getPath();
        if (path == null) {
            ambjVar = "";
        } else {
            int i = ambp.a;
            ambjVar = ambn.a.c(path, StandardCharsets.UTF_8).toString();
        }
        return uri.getScheme() + "://" + uri.getAuthority() + "/redacted-" + ambjVar;
    }

    public static String bk(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return "redacted-pii[" + charSequence.length() + "-chars]";
    }

    public static String bl(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (Log.isLoggable("Bugle", 3)) {
            return uri.toString();
        }
        return uri.getScheme() + "://" + uri.getAuthority() + "/...Redacted...";
    }

    public static String bm(String str) {
        xze xzeVar = xca.a;
        if (msx.g(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            if (Character.isDigit(sb.charAt(length))) {
                sb.setCharAt(length, 'x');
                i++;
            }
            if (i == 7) {
                break;
            }
        }
        return sb.toString();
    }

    public static String bn(Context context, long j) {
        long round = Math.round(((float) j) / 1000.0f);
        return String.format(dzf.c(context.getResources().getConfiguration()).f(0), "%d:%02d", Long.valueOf(round / 60), Long.valueOf(round % 60));
    }

    public static xxk bo(Boolean bool, Boolean bool2, ypi ypiVar, ConversationIdType conversationIdType, String str, ResolvedRecipient resolvedRecipient, boolean z, amfe amfeVar, int i, int i2, int i3, amzu amzuVar) {
        if (i != 0 && i2 != 0 && i3 != 0) {
            return new xxk(bool, bool2, ypiVar, conversationIdType, str, resolvedRecipient, z, amfeVar, i, i2, i3, amzuVar, false, null, 12288);
        }
        throw null;
    }

    public static /* synthetic */ xxk bp(Boolean bool, Boolean bool2, ConversationIdType conversationIdType, ResolvedRecipient resolvedRecipient, amfe amfeVar, int i, int i2, amzu amzuVar, int i3) {
        ypi ypiVar;
        ConversationIdType conversationIdType2;
        ResolvedRecipient resolvedRecipient2;
        boolean z;
        amfe amfeVar2;
        int i4;
        Boolean bool3;
        Boolean bool4;
        amzu amzuVar2;
        if ((i3 & 4) != 0) {
            ypiVar = ypi.b;
        } else {
            ypiVar = null;
        }
        if ((i3 & 8) != 0) {
            conversationIdType2 = null;
        } else {
            conversationIdType2 = conversationIdType;
        }
        if ((i3 & 32) != 0) {
            resolvedRecipient2 = null;
        } else {
            resolvedRecipient2 = resolvedRecipient;
        }
        if ((i3 & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i3 & 128) != 0) {
            amfeVar2 = null;
        } else {
            amfeVar2 = amfeVar;
        }
        if ((i3 & 1024) != 0) {
            i4 = 2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 1;
        if ((i3 & 2) != 0) {
            bool3 = null;
        } else {
            bool3 = bool2;
        }
        if (1 == i5) {
            bool4 = null;
        } else {
            bool4 = bool;
        }
        if ((i3 & 2048) != 0) {
            amzuVar2 = null;
        } else {
            amzuVar2 = amzuVar;
        }
        return bo(bool4, bool3, ypiVar, conversationIdType2, null, resolvedRecipient2, z, amfeVar2, 3, i, i4, amzuVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.xxk bq(defpackage.xxn r17, defpackage.amfe r18, int r19) {
        /*
            r14 = r17
            r17.getClass()
            int r0 = r14.b
            r1 = r0 & 1
            r0 = r0 & 2
            java.lang.String r2 = "Failed requirement."
            r3 = 0
            if (r0 == 0) goto L15
            if (r1 == 0) goto L13
            goto L17
        L13:
            r1 = r3
            goto L26
        L15:
            if (r1 == 0) goto L91
        L17:
            xxi r0 = r14.c
            if (r0 != 0) goto L1d
            xxi r0 = defpackage.xxi.a
        L1d:
            boolean r0 = r0.d
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1 = r0
        L26:
            int r0 = r14.b
            r0 = r0 & 2
            if (r0 == 0) goto L46
            ymv r0 = r14.d
            if (r0 != 0) goto L32
            ymv r0 = defpackage.ymv.a
        L32:
            boolean r0 = r0.d
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r18 == 0) goto L3e
            r4 = r0
            goto L47
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        L46:
            r4 = r3
        L47:
            int r0 = r14.b
            r5 = r0 & 8
            if (r5 == 0) goto L61
            long r5 = r14.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = new com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType
            r7.<init>(r5)
            boolean r5 = r7.b()
            if (r5 != 0) goto L5b
            goto L62
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L61:
            r7 = r3
        L62:
            r0 = r0 & 4
            if (r0 == 0) goto L76
            java.lang.String r0 = r14.e
            int r3 = r0.length()
            if (r3 <= 0) goto L70
            r5 = r0
            goto L77
        L70:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L76:
            r5 = r3
        L77:
            xxk r16 = new xxk
            r13 = 1
            r15 = 3168(0xc60, float:4.44E-42)
            r3 = 0
            r6 = 0
            r8 = 0
            r9 = 3
            r11 = 0
            r12 = 0
            r0 = r16
            r2 = r4
            r4 = r7
            r7 = r8
            r8 = r18
            r10 = r19
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        L91:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyb.bq(xxn, amfe, int):xxk");
    }

    public static xxc br(boolean z, String str, boolean z2, boolean z3, yni yniVar, int i, int i2, int i3) {
        if (i3 != 0) {
            return new xxc(z, str, z2, z3, yniVar, i, i2, i3, false, null);
        }
        throw null;
    }

    public static String bs(Context context) {
        return bt(context.getString(R.string.learn_more));
    }

    public static String bt(String str) {
        return str.replaceAll("\\s", " ");
    }

    public static void bu(Context context, SpannableStringBuilder spannableStringBuilder, String str, ClickableSpan clickableSpan) {
        int lastIndexOf = spannableStringBuilder.toString().lastIndexOf(str);
        if (lastIndexOf >= 0) {
            int length = str.length() + lastIndexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(bw(context, android.R.attr.textColorLink)), lastIndexOf, length, 17);
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), lastIndexOf, length, 17);
            if (clickableSpan != null) {
                spannableStringBuilder.setSpan(clickableSpan, lastIndexOf, length, 17);
            }
        }
    }

    public static void bv(Context context, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        xwd xwdVar;
        if (onClickListener != null) {
            xwdVar = new xwd(onClickListener);
        } else {
            xwdVar = null;
        }
        bu(context, spannableStringBuilder, str, xwdVar);
    }

    public static int bw(Context context, int i) {
        return bx(context, i).data;
    }

    public static TypedValue bx(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        xyl.k(context.getTheme().resolveAttribute(i, typedValue, true));
        return typedValue;
    }

    public static boolean by() {
        if (aczv.n() >= 0 && aczv.p() >= 0 && aczv.q() >= 0) {
            return true;
        }
        return false;
    }

    public static String bz(String str) {
        return bA(true, str);
    }

    public static cg c(ajwt ajwtVar, int i, yyu yyuVar) {
        ajwtVar.getClass();
        ((ifq) yyuVar.b.b()).g(Boolean.valueOf(!((Boolean) yyv.j.e()).booleanValue()));
        Bundle bundle = new Bundle(1);
        bundle.putInt("contact_picker_source", i - 1);
        yyw a = yyw.a(ajwtVar);
        a.ak(bundle);
        return a;
    }

    public static void cA(apct apctVar, aozy aozyVar) {
        apctVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xkx xkxVar = (xkx) aozyVar.b;
        xkx xkxVar2 = xkx.a;
        xkxVar.c = apctVar;
        xkxVar.b |= 1;
    }

    public static /* synthetic */ xkv cB(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (xkv) s;
    }

    public static void cC(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xkv xkvVar = (xkv) aozyVar.b;
        xkv xkvVar2 = xkv.a;
        xkvVar.b = z;
    }

    public static UUID cD(aozb aozbVar) {
        ByteBuffer wrap = ByteBuffer.wrap(aozbVar.H());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    @Deprecated
    public static long cE(xhv xhvVar) {
        if (xhvVar.d()) {
            return -1L;
        }
        return xhvVar.a();
    }

    public static void cF(amnf amnfVar, Duration duration, Optional optional, Optional optional2, int i, int i2, Optional optional3, armf armfVar, List list) {
        int i3;
        if (optional3.isPresent()) {
            if (true != ((Boolean) optional3.get()).booleanValue()) {
                i3 = 3;
            } else {
                i3 = 2;
            }
        } else {
            i3 = 4;
        }
        aozy createBuilder = amng.a.createBuilder();
        aozn i4 = aotl.i(duration);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amng amngVar = (amng) createBuilder.b;
        i4.getClass();
        amngVar.g = i4;
        amngVar.b |= 8;
        int cH = cH(optional);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amng amngVar2 = (amng) createBuilder.b;
        amngVar2.d = cH - 1;
        amngVar2.b |= 2;
        int cH2 = cH(optional2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amng amngVar3 = (amng) createBuilder.b;
        amngVar3.e = cH2 - 1;
        amngVar3.b |= 4;
        int cH3 = cH(Optional.of(Integer.valueOf(i)));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amng amngVar4 = (amng) createBuilder.b;
        amngVar4.j = cH3 - 1;
        amngVar4.b |= 64;
        int cH4 = cH(Optional.of(Integer.valueOf(i2)));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amng amngVar5 = (amng) apagVar;
        amngVar5.k = cH4 - 1;
        amngVar5.b |= 128;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amng amngVar6 = (amng) apagVar2;
        amngVar6.c = amnfVar.g;
        amngVar6.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amng amngVar7 = (amng) createBuilder.b;
        amngVar7.h = i3 - 1;
        amngVar7.b |= 16;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            createBuilder.bu((aozy) it.next());
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT;
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
        amng amngVar8 = (amng) createBuilder.s();
        amngVar8.getClass();
        amfrVar2.aj = amngVar8;
        amfrVar2.d |= 16384;
        ((maq) armfVar.b()).j(amfqVar);
    }

    public static int cG(int i) {
        return cH(Optional.of(Integer.valueOf(i)));
    }

    public static int cH(Optional optional) {
        if (optional.isEmpty()) {
            return 1;
        }
        int intValue = ((Integer) optional.get()).intValue();
        if (intValue <= 0) {
            return 2;
        }
        if (intValue < 2) {
            return 3;
        }
        if (intValue < 3) {
            return 4;
        }
        if (intValue < 4) {
            return 5;
        }
        if (intValue < 5) {
            return 6;
        }
        if (intValue < 6) {
            return 7;
        }
        if (intValue < 7) {
            return 8;
        }
        if (intValue < 8) {
            return 9;
        }
        if (intValue < 9) {
            return 10;
        }
        if (intValue < 10) {
            return 11;
        }
        if (intValue < 11) {
            return 12;
        }
        if (intValue < 101) {
            return 13;
        }
        if (intValue < 1001) {
            return 103;
        }
        if (intValue < 5001) {
            return 105;
        }
        if (intValue < 10001) {
            return 106;
        }
        if (intValue < 50001) {
            return 108;
        }
        return 113;
    }

    public static aqfn cI(qei qeiVar) {
        qeh b2 = qeh.b(qeiVar.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        aozy cJ = cJ();
                        String str = qeiVar.d;
                        if (!cJ.b.isMutable()) {
                            cJ.u();
                        }
                        aqfn aqfnVar = (aqfn) cJ.b;
                        aqfn aqfnVar2 = aqfn.a;
                        str.getClass();
                        aqfnVar.c = str;
                        asku askuVar = asku.RCS_BOT;
                        if (!cJ.b.isMutable()) {
                            cJ.u();
                        }
                        ((aqfn) cJ.b).b = askuVar.a();
                        return (aqfn) cJ.s();
                    }
                    throw new IllegalArgumentException("Invalid ChatEndpoint Type.");
                }
            } else {
                aozy cJ2 = cJ();
                String str2 = qeiVar.d;
                if (!cJ2.b.isMutable()) {
                    cJ2.u();
                }
                aqfn aqfnVar3 = (aqfn) cJ2.b;
                aqfn aqfnVar4 = aqfn.a;
                str2.getClass();
                aqfnVar3.c = str2;
                asku askuVar2 = asku.PHONE_NUMBER;
                if (!cJ2.b.isMutable()) {
                    cJ2.u();
                }
                ((aqfn) cJ2.b).b = askuVar2.a();
                return (aqfn) cJ2.s();
            }
        }
        throw new IllegalArgumentException("Endpoint type is not supported.");
    }

    public static aozy cJ() {
        aozy createBuilder = aqfn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqfn) createBuilder.b).d = "RCS";
        return createBuilder;
    }

    public static int cK(int i) {
        return i - 1;
    }

    public static amgu cL() {
        amgl amglVar = (amgl) amgu.a.createBuilder();
        amxo amxoVar = amxo.RCS_TACHYGRAM;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = amxoVar.h;
        amguVar.c |= 2097152;
        return (amgu) amglVar.s();
    }

    public static qfd cM(Map map) {
        boolean z;
        aozy createBuilder = qfd.a.createBuilder();
        createBuilder.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (d.F(str, "is_upgrade_from_mms_group")) {
                if (d.F(str2, "0")) {
                    z = false;
                } else if (d.F(str2, "1")) {
                    z = true;
                } else {
                    throw new IllegalArgumentException(String.valueOf(str).concat(" must be either 0 or 1."));
                }
                qkq.m(z, createBuilder);
            }
        }
        return qkq.l(createBuilder);
    }

    @armg
    public static alog cN(xde xdeVar, List list, xcv xcvVar, int i) {
        Object G;
        G = arrn.G(arpj.a, new mgq(xdeVar, list, xcvVar, i, (arpe) null, 2));
        return (alog) G;
    }

    public static Bundle cO(apeq apeqVar) {
        apeqVar.getClass();
        Bundle bundle = new Bundle();
        if ((apeqVar.b & 1) != 0) {
            bundle.putBoolean("enabledMMS", apeqVar.d);
        }
        if ((apeqVar.b & 2) != 0) {
            bundle.putBoolean("enableGroupMms", apeqVar.e);
        }
        if ((apeqVar.b & 4) != 0) {
            bundle.putBoolean("groupChatDefaultsToMMS", apeqVar.f);
        }
        if ((apeqVar.b & 8) != 0) {
            bundle.putBoolean("supportMmsContentDisposition", apeqVar.g);
        }
        if ((apeqVar.b & 16) != 0) {
            bundle.putBoolean("supportHttpCharsetHeader", apeqVar.h);
        }
        if ((apeqVar.b & 32) != 0) {
            bundle.putInt("httpSocketTimeout", apeqVar.i);
        }
        if ((apeqVar.b & 64) != 0) {
            bundle.putInt("maxImageHeight", apeqVar.j);
        }
        if ((apeqVar.b & 128) != 0) {
            bundle.putInt("maxImageWidth", apeqVar.k);
        }
        if ((apeqVar.b & 512) != 0) {
            bundle.putBoolean("useCustomUserAgent", apeqVar.l);
        }
        if ((apeqVar.b & 1024) != 0) {
            bundle.putBoolean("supportMmsPriority", apeqVar.m);
        }
        if ((apeqVar.b & 2048) != 0) {
            bundle.putBoolean("enabledNotifyWapMMSC", apeqVar.n);
        }
        if ((apeqVar.b & 4096) != 0) {
            bundle.putInt("recipientLimit", apeqVar.o);
        }
        if ((apeqVar.b & 8192) != 0) {
            bundle.putString("uaProfTagName", apeqVar.p);
        }
        if ((apeqVar.b & 16384) != 0) {
            bundle.putString("httpParams", apeqVar.q);
        }
        if ((apeqVar.b & 32768) != 0) {
            bundle.putString("naiSuffix", apeqVar.r);
        }
        if ((apeqVar.b & 65536) != 0) {
            bundle.putString("spamForwardingNumber", apeqVar.s);
        }
        if ((apeqVar.b & 131072) != 0) {
            bundle.putBoolean("aliasEnabled", apeqVar.t);
        }
        if ((apeqVar.b & 262144) != 0) {
            bundle.putInt("aliasMinChars", apeqVar.u);
        }
        if ((apeqVar.b & 524288) != 0) {
            bundle.putInt("aliasMaxChars", apeqVar.v);
        }
        if ((apeqVar.b & 1048576) != 0) {
            bundle.putBoolean("enableMultipartSMS", apeqVar.w);
        }
        if ((apeqVar.b & 2097152) != 0) {
            bundle.putBoolean("sendMultipartSmsAsSeparateMessages", apeqVar.x);
        }
        if ((apeqVar.b & 4194304) != 0) {
            bundle.putBoolean("smsUsesSimpleCharactersOnly", apeqVar.y);
        }
        if ((apeqVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            bundle.putBoolean("smsEncodingChangeable", apeqVar.z);
        }
        if ((apeqVar.b & 16777216) != 0) {
            bundle.putInt("maxMessageSize", apeqVar.A);
        }
        if ((apeqVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
            bundle.putInt("smsToMmsTextThreshold", apeqVar.B);
        }
        if ((apeqVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
            bundle.putInt("smsToMmsTextLengthThreshold", apeqVar.C);
        }
        if ((apeqVar.b & 1073741824) != 0) {
            bundle.putString("emailGatewayNumber", apeqVar.D);
        }
        if ((apeqVar.b & Integer.MIN_VALUE) != 0) {
            bundle.putBoolean("enabledTransID", apeqVar.E);
        }
        if ((apeqVar.c & 1) != 0) {
            bundle.putBoolean("enableWapPushSI", apeqVar.F);
        }
        if ((apeqVar.c & 2) != 0) {
            bundle.putBoolean("allowEnablingWapPushSI", apeqVar.G);
        }
        if ((apeqVar.c & 4) != 0) {
            bundle.putBoolean("mms_auto_retrieve_enabled_bool", apeqVar.H);
        }
        if ((apeqVar.c & 8) != 0) {
            bundle.putBoolean("allowChangingMmsRoamingAutoRetrieve", apeqVar.I);
        }
        if ((apeqVar.c & 16) != 0) {
            bundle.putBoolean("mmsRoamingAutoRetrieveByDefault", apeqVar.J);
        }
        if ((apeqVar.c & 32) != 0) {
            bundle.putBoolean("allowEditingSmscAddress", apeqVar.K);
        }
        if ((apeqVar.c & 64) != 0) {
            bundle.putBoolean("config_cellBroadcastAppLinks", apeqVar.L);
        }
        if ((apeqVar.c & 128) != 0) {
            bundle.putString("smsErrorDescMap", apeqVar.M);
        }
        if ((apeqVar.c & 256) != 0) {
            bundle.putString("hiddenContactsData", apeqVar.N);
        }
        if ((apeqVar.c & 512) != 0) {
            bundle.putBoolean("enableSMSDeliveryReports", apeqVar.O);
        }
        if ((apeqVar.c & 1024) != 0) {
            bundle.putBoolean("smsDeliveryReportSettingOnByDefault", apeqVar.P);
        }
        return bundle;
    }

    public static /* synthetic */ String cP(int i) {
        switch (i) {
            case 1:
                return "INT";
            case 2:
                return "BOOL";
            case 3:
                return "LONG";
            case 4:
                return "STRING";
            case 5:
                return "INT_ARRAY";
            case 6:
                return "STRING_ARRAY";
            case 7:
                return "UNKNOWN";
            default:
                return "null";
        }
    }

    public static int cQ(Object obj) {
        if (!(obj instanceof Boolean) && !obj.equals(Boolean.FALSE.toString()) && !obj.equals(Boolean.TRUE.toString())) {
            if (obj instanceof Integer) {
                return 1;
            }
            if (obj instanceof Long) {
                return 3;
            }
            if (obj instanceof int[]) {
                return 5;
            }
            if (obj instanceof String[]) {
                return 6;
            }
            if (obj instanceof String) {
                return 4;
            }
            return 7;
        }
        return 2;
    }

    public static int cR() {
        if (!albo.ar("MOTOROLA", Build.MANUFACTURER) && !albo.ar("MOTOROLA", Build.BRAND)) {
            if (aE()) {
                return R.xml.huawei_config_override;
            }
            if (aF()) {
                return R.xml.lge_config_override;
            }
            return Integer.MIN_VALUE;
        }
        return R.xml.motorola_config_override;
    }

    public static /* synthetic */ String cS(Object obj, int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 4) {
                if (i2 != 5) {
                    return obj.toString();
                }
                return Arrays.toString((String[]) obj);
            }
            return Arrays.toString((int[]) obj);
        }
        throw null;
    }

    public static wyj cT(ParticipantsTable.BindData bindData) {
        return new wyj(bindData.O(), bindData.J(), uvl.l(lru.g(bindData).c));
    }

    public static wyj cU(ParticipantsTable.BindData bindData) {
        if (bindData != null) {
            return cT(bindData);
        }
        return null;
    }

    public static int cV(int i) {
        return i - 1;
    }

    public static /* synthetic */ String cW(int i) {
        switch (i) {
            case 1:
                return "BASIC_TEXT";
            case 2:
                return "LOCATION_INFORMATION";
            case 3:
                return "FILE_TRANSFER_DETAILS";
            case 4:
                return "MESSAGE_RECEIPT";
            case 5:
                return "TYPING_INDICATOR";
            case 6:
                return "RBM_SUGGESTION_RESPONSE";
            case 7:
                return "RBM_SPAM_REPORT";
            default:
                return "PROTO";
        }
    }

    public static /* synthetic */ wxo cX(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wxo) s;
    }

    public static void cY(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wxo wxoVar = (wxo) aozyVar.b;
        wxo wxoVar2 = wxo.a;
        wxoVar.c = i - 1;
        wxoVar.b |= 1;
    }

    public static /* synthetic */ wxm cZ(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wxm) s;
    }

    public static int ca(xlb xlbVar) {
        if (bU(xlbVar)) {
            return 1;
        }
        if (bV(xlbVar)) {
            return 2;
        }
        if (bW(xlbVar)) {
            return 3;
        }
        throw new IllegalStateException("Unrecognized sync type");
    }

    public static /* synthetic */ String cb(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "SPOT_SYNC";
            }
            return "PARTIAL_SYNC";
        }
        return "FULL_SYNC";
    }

    public static Object cc(xlb xlbVar) {
        Object obj;
        if (bU(xlbVar)) {
            if (xlbVar.c == 3) {
                obj = (xkv) xlbVar.d;
            } else {
                obj = xkv.a;
            }
            obj.getClass();
        } else if (bV(xlbVar)) {
            if (xlbVar.c == 4) {
                obj = (xkx) xlbVar.d;
            } else {
                obj = xkx.a;
            }
            obj.getClass();
        } else if (bW(xlbVar)) {
            if (xlbVar.c == 5) {
                obj = (xky) xlbVar.d;
            } else {
                obj = xky.a;
            }
            obj.getClass();
        } else {
            throw new IllegalArgumentException("Unrecognized sync type");
        }
        return obj;
    }

    public static void cd(xzx xzxVar, xmk xmkVar) {
        xzxVar.z("batchId", xmkVar.b());
    }

    public static void ce(xzx xzxVar, xlb xlbVar, String str) {
        aozb aozbVar = xlbVar.e;
        aozbVar.getClass();
        xzxVar.z(str, bY(aozbVar));
    }

    public static int cg(xkj xkjVar) {
        int i;
        Long l = (Long) xim.c.e();
        Object e = xim.g.e();
        e.getClass();
        int r = arrn.r(((Number) e).intValue(), 1);
        Object e2 = xim.f.e();
        e2.getClass();
        int r2 = arrn.r(((Number) e2).intValue(), r + 1);
        if (xkjVar != null) {
            i = (int) (xkjVar.e * (((float) l.longValue()) / ((float) xkjVar.f.toMillis())));
        } else {
            i = r;
        }
        return arrn.u(i, r, r2);
    }

    public static /* synthetic */ xla ch(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (xla) s;
    }

    public static void ci(xkz xkzVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xla xlaVar = (xla) aozyVar.b;
        xla xlaVar2 = xla.a;
        xlaVar.c = xkzVar;
        xlaVar.b |= 1;
    }

    public static xkx cj(aozy aozyVar) {
        xkx xkxVar;
        xlb xlbVar = (xlb) aozyVar.b;
        if (xlbVar.c == 4) {
            xkxVar = (xkx) xlbVar.d;
        } else {
            xkxVar = xkx.a;
        }
        xkxVar.getClass();
        return xkxVar;
    }

    public static xky ck(aozy aozyVar) {
        xky xkyVar;
        xlb xlbVar = (xlb) aozyVar.b;
        if (xlbVar.c == 5) {
            xkyVar = (xky) xlbVar.d;
        } else {
            xkyVar = xky.a;
        }
        xkyVar.getClass();
        return xkyVar;
    }

    public static /* synthetic */ xlb cl(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (xlb) s;
    }

    public static void cm(xkv xkvVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlb xlbVar = (xlb) aozyVar.b;
        xlb xlbVar2 = xlb.a;
        xlbVar.d = xkvVar;
        xlbVar.c = 3;
    }

    public static void cn(xkx xkxVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlb xlbVar = (xlb) aozyVar.b;
        xlb xlbVar2 = xlb.a;
        xlbVar.d = xkxVar;
        xlbVar.c = 4;
    }

    public static void co(xky xkyVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlb xlbVar = (xlb) aozyVar.b;
        xlb xlbVar2 = xlb.a;
        xlbVar.d = xkyVar;
        xlbVar.c = 5;
    }

    public static void cp(aozb aozbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlb xlbVar = (xlb) aozyVar.b;
        xlb xlbVar2 = xlb.a;
        xlbVar.e = aozbVar;
    }

    public static void cq(xla xlaVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlb xlbVar = (xlb) aozyVar.b;
        xlb xlbVar2 = xlb.a;
        xlbVar.i = xlaVar;
        xlbVar.b |= 2;
    }

    public static /* synthetic */ void cr(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlb xlbVar = (xlb) aozyVar.b;
        xlb xlbVar2 = xlb.a;
        xlbVar.h = xlb.emptyProtobufList();
    }

    public static /* synthetic */ void cs(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xlb xlbVar = (xlb) aozyVar.b;
        xlb xlbVar2 = xlb.a;
        xlbVar.f = xlb.emptyProtobufList();
    }

    public static /* synthetic */ void ct(aozy aozyVar) {
        DesugarCollections.unmodifiableList(((xlb) aozyVar.b).h).getClass();
    }

    public static /* synthetic */ void cu(aozy aozyVar) {
        DesugarCollections.unmodifiableList(((xlb) aozyVar.b).f).getClass();
    }

    public static /* synthetic */ xky cv(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (xky) s;
    }

    public static apct cw(aozy aozyVar) {
        apct apctVar = ((xky) aozyVar.b).d;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        apctVar.getClass();
        return apctVar;
    }

    public static void cx(apct apctVar, aozy aozyVar) {
        apctVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xky xkyVar = (xky) aozyVar.b;
        xky xkyVar2 = xky.a;
        xkyVar.e = apctVar;
        xkyVar.b |= 2;
    }

    public static void cy(apct apctVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        xky xkyVar = (xky) aozyVar.b;
        xky xkyVar2 = xky.a;
        xkyVar.f = apctVar;
        xkyVar.b |= 4;
    }

    public static /* synthetic */ xkx cz(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (xkx) s;
    }

    public static boolean d() {
        Object e = ((utz) ymd.k.get()).e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    public static void da(wxo wxoVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wxm wxmVar = (wxm) aozyVar.b;
        wxm wxmVar2 = wxm.a;
        wxmVar.c = wxoVar;
        wxmVar.b |= 1;
    }

    public static /* synthetic */ wfh db(aozy aozyVar) {
        aozyVar.getClass();
        return new wfh(aozyVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xge, java.lang.Object] */
    public static zap dc(Optional optional) {
        optional.isPresent();
        return optional.get().a(null, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    public static boolean dd(vyv vyvVar) {
        vyvVar.getClass();
        if (((Boolean) vyvVar.a.b()).booleanValue() && ((Boolean) qpf.a.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ vyv de(aozy aozyVar) {
        aozyVar.getClass();
        return new vyv(aozyVar);
    }

    public static /* synthetic */ vyv df(aozy aozyVar) {
        aozyVar.getClass();
        return new vyv(aozyVar);
    }

    public static xeg dg(aogy aogyVar, arwe arweVar, xej xejVar, yyt yytVar, Object obj) {
        return new xeg(aogyVar, arweVar, xejVar, yytVar, (wpp) obj);
    }

    public static int dh(znj znjVar) {
        return znjVar.o(24, 0);
    }

    public static Point di(znj znjVar) {
        int dh = dh(znjVar);
        Point point = new Point(znjVar.o(18, -1), znjVar.o(19, -1));
        if (dh % 180 != 0) {
            point.set(point.y, point.x);
        }
        return point;
    }

    public static yyb dj(asmb asmbVar, xrx xrxVar, String str) {
        xta xtaVar;
        if (asmbVar == null) {
            pwq a = pwr.a();
            a.f(xoc.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            return new xta(a.a());
        }
        if (asmbVar.r()) {
            Object obj = asmbVar.b;
            apvj apvjVar = (apvj) obj;
            if (apvjVar.a.equals(apvi.CANCELED)) {
                return xsy.a;
            }
            pwq a2 = pwr.a();
            a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_TRANSFER_EXCEPTION);
            a2.c((Throwable) obj);
            a2.g(str);
            Throwable cause = apvjVar.getCause();
            if (anfi.a("bugle.enable_cronet_in_tachygram_file_upload", "bugle") && cause != null && (cause instanceof CronetException)) {
                a2.b((CronetException) cause);
            }
            return new xta(a2.a());
        }
        Object obj2 = asmbVar.a;
        if (obj2 != null) {
            apuv apuvVar = (apuv) obj2;
            int i = apuvVar.a;
            if (i == 200) {
                Object obj3 = apuvVar.c;
                if (obj3 == null) {
                    pwq a3 = pwr.a();
                    a3.f(xoc.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
                    a3.g(str);
                    return new xta(a3.a());
                }
                try {
                    try {
                        return xrxVar.a((aqhy) aqhy.a.getParserForType().e(aozb.A((InputStream) obj3), aozs.a()));
                    } catch (apba e) {
                        pwq a4 = pwr.a();
                        a4.f(xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE);
                        a4.g(str);
                        a4.c(e);
                        xtaVar = new xta(a4.a());
                        return xtaVar;
                    }
                } catch (IOException e2) {
                    pwq a5 = pwr.a();
                    a5.f(xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE);
                    a5.g(str);
                    a5.c(e2);
                    xtaVar = new xta(a5.a());
                    return xtaVar;
                }
            }
            pwq a6 = pwr.a();
            a6.f(xoc.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            a6.g(str);
            a6.e(i);
            return new xta(a6.a());
        }
        pwq a7 = pwr.a();
        a7.f(xoc.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
        a7.g(str);
        return new xta(a7.a());
    }

    private static String dk(cas casVar) {
        return (String) casVar.a();
    }

    private static aeqj dl(cas casVar) {
        return (aeqj) casVar.a();
    }

    public static boolean e(rry rryVar) {
        rryVar.getClass();
        if (!d()) {
            return false;
        }
        String I = rryVar.I();
        if (I != null && I.length() != 0) {
            return false;
        }
        return true;
    }

    public static ackj f(akbm akbmVar) {
        adjw adjwVar = new adjw();
        adjwVar.a = akbmVar.getLooper();
        return new ackj(adjwVar);
    }

    public static String g(ackf ackfVar, String str) {
        String e = ackfVar.e(str);
        e.getClass();
        return e;
    }

    public static String h(ackf ackfVar, String str) {
        String e = ackfVar.e(str);
        if (e == null) {
            return "";
        }
        return e;
    }

    public static boolean i(ParticipantsTable.BindData bindData) {
        bindData.getClass();
        if (bindData.r() != 10 && bindData.r() != 11) {
            return false;
        }
        return true;
    }

    public static String j(String str) {
        return ysu.b(str, false);
    }

    public static void k(zec zecVar, bwj bwjVar, int i) {
        int i2;
        aeym aeymVar;
        int i3;
        zecVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(3762328);
        if (i4 == 0) {
            if (true != c.G(zecVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else if (zecVar.a && (aeymVar = zecVar.b) != null) {
            adcx.Z(aeymVar, dea.a(cga.e, "SimSelectorConversation"), c, 48);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zecVar, i, 10);
        }
    }

    public static void l(zdw zdwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1199880923);
        if (i4 == 0) {
            if (true != c.G(zdwVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cas a = cak.a(zdwVar.a, c);
            if (dk(a).length() > 0) {
                Toast.makeText((Context) c.g(AndroidCompositionLocals_androidKt.b), dk(a), 0).show();
                zdwVar.b.a();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zdwVar, i, 9);
        }
    }

    public static void m(zcx zcxVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga a;
        boolean z;
        bwk bwkVar;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-530729905);
        if (i4 == 0) {
            if (true != c2.G(zcxVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            int i5 = i2 & 14;
            aov a2 = aoz.a(c2);
            if (zcxVar.b.isEmpty()) {
                a = amv.c(cga.e, 1.0f);
            } else {
                c = amv.c(cga.e, 1.0f);
                a = c.a(amv.b);
            }
            c2.y(966160748);
            if (zcxVar.d != null) {
                c2.y(966163441);
                bwk bwkVar2 = (bwk) c2;
                Object T = bwkVar2.T();
                if (i5 == 4 || T == bwj.a.a) {
                    T = new ynn(zcxVar, 8);
                    bwkVar2.ad(T);
                }
                bwkVar2.Y();
                a = dhb.c(a, false, (arqr) T);
            }
            bwk bwkVar3 = (bwk) c2;
            bwkVar3.Y();
            cga a3 = dea.a(a, "ContactSuggestionList");
            c2.y(966168634);
            Object T2 = bwkVar3.T();
            if (i5 == 4 || T2 == bwj.a.a) {
                T2 = new ynn(zcxVar, 10);
                bwkVar3.ad(T2);
            }
            bwkVar3.Y();
            anp.a(a3, a2, null, false, null, null, null, false, (arqr) T2, c2, 0, 252);
            String str = zcxVar.a;
            c2.y(966187337);
            if (i5 == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean G = c2.G(a2) | z;
            Object T3 = bwkVar3.T();
            if (!G && T3 != bwj.a.a) {
                bwkVar = bwkVar3;
            } else {
                T3 = new yqs(zcxVar, a2, (arpe) null, 18);
                bwkVar = bwkVar3;
                bwkVar.ad(T3);
            }
            bwkVar.Y();
            bxl.g(str, (arqv) T3, c2);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zcxVar, i, 8);
        }
    }

    public static boolean n(List list) {
        if (list.size() == 1) {
            return false;
        }
        Iterator it = list.iterator();
        boolean z = true;
        boolean z2 = true;
        while (it.hasNext()) {
            nfb nfbVar = (nfb) it.next();
            if (z && nfbVar.d) {
                z = true;
            } else {
                z = false;
            }
            if (z2 && nfbVar.e) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void o(List list) {
        boolean z = false;
        boolean z2 = true;
        if (list.size() == 1) {
            nfb nfbVar = (nfb) list.get(0);
            alvw g = zcr.a.g();
            g.X(alwp.a, "BugleContacts");
            ((alvg) g.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 338, "ChatStarterImpl.kt")).t("Opening a 1-1 conversation, rcsEnabledCap: %b", Boolean.valueOf(nfbVar.d));
            return;
        }
        Iterator it = list.iterator();
        boolean z3 = true;
        boolean z4 = true;
        while (it.hasNext()) {
            nfb nfbVar2 = (nfb) it.next();
            if (z3 && nfbVar2.d) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 && nfbVar2.e) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (z3) {
            if (z4) {
                alvw g2 = zcr.a.g();
                g2.X(alwp.a, "BugleContacts");
                ((alvg) g2.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 306, "ChatStarterImpl.kt")).q("attempting the creation of an RCS group");
                z4 = true;
                alvw g3 = zcr.a.g();
                g3.X(alwp.a, "BugleContacts");
                ((alvg) g3.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 312, "ChatStarterImpl.kt")).J("othersCount: %d, othersRcsCapable: %b, othersGroupRcsCapable: %b", Integer.valueOf(list.size()), Boolean.valueOf(z2), Boolean.valueOf(z4));
            }
            z4 = false;
            z = true;
        }
        alvw g4 = zcr.a.g();
        g4.X(alwp.a, "BugleContacts");
        ((alvg) g4.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 308, "ChatStarterImpl.kt")).q("attempting the creation of an MMS group");
        z2 = z;
        alvw g32 = zcr.a.g();
        g32.X(alwp.a, "BugleContacts");
        ((alvg) g32.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 312, "ChatStarterImpl.kt")).J("othersCount: %d, othersRcsCapable: %b, othersGroupRcsCapable: %b", Integer.valueOf(list.size()), Boolean.valueOf(z2), Boolean.valueOf(z4));
    }

    public static aewt q(cas casVar) {
        return (aewt) casVar.a();
    }

    public static void r(zcg zcgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(150024628);
        if (i6 == 0) {
            if (true != c.G(zcgVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            i3 = 1;
        } else {
            if (zcgVar.a) {
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new kie(zcgVar, cgaVar, i, 20);
                    return;
                }
                return;
            }
            zar.a(zcgVar.e, c, 0);
            i3 = 1;
            bqv.c(null, null, 0L, 0L, brg.a, brg.a, null, cdk.e(-1435411655, new ifn(cgaVar, zcgVar, 11, null), c), c, 127);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new zcj(zcgVar, cgaVar, i, i3);
        }
    }

    public static void s(ascg ascgVar, bqn bqnVar, bwj bwjVar, int i) {
        bqnVar.getClass();
        bwj c = bwjVar.c(876214113);
        bxl.g(bqnVar, new yqs(ascgVar, bqnVar, (arpe) null, 17), c);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(ascgVar, bqnVar, i, 0);
        }
    }

    public static void t(zcg zcgVar, bwj bwjVar, int i) {
        int i2;
        cga b2;
        cga a;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1851118647);
        if (i4 == 0) {
            if (true != c2.G(zcgVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            kkc a2 = iaw.a(c2);
            yzc.A(a2, cku.g, false, null, c2, 48, 12);
            cas a3 = cak.a(zcgVar.h, c2);
            c2.y(472838091);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bqn();
                bwkVar.ad(T);
            }
            bqn bqnVar = (bqn) T;
            bwkVar.Y();
            s(zcgVar.i, bqnVar, c2, 56);
            b2 = amv.b(cga.e, 1.0f);
            a = adf.a(anh.b(b2, new amc(anl.e(c2), 15)), bmp.a(c2).p, clw.a);
            cga b3 = anh.b(a, new amc(anl.e(c2), 32));
            c2.y(472851030);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = yzm.e;
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            c = dhb.c(b3, false, (arqr) T2);
            ahji.y(c, null, null, cdk.e(31857807, new lfw(bqnVar, 19), c2), null, 0, 0L, 0L, null, cdk.e(-1788911784, new qjl(a2, zcgVar, a3, 2), c2), c2, 805309440, 502);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zcgVar, i, 7);
        }
    }

    public static void u(ascv ascvVar, cga cgaVar, bwj bwjVar, int i) {
        cgaVar.getClass();
        bwj c = bwjVar.c(-1175084648);
        cas a = cak.a(ascvVar, c);
        if (dl(a) != null) {
            aeqj dl = dl(a);
            dl.getClass();
            agkx.s(dl, amh.c(ani.a(cgaVar), amh.h(brg.a, brg.a, 16.0f, 17.0f, 3)), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kie(ascvVar, cgaVar, i, 19);
        }
    }

    public static int v(String str) {
        if (gh.e(str)) {
            return R.string.attachment_audio_clip;
        }
        if (gh.s(str)) {
            return R.string.attachment_location;
        }
        if (gh.m(str)) {
            return R.string.attachment_image;
        }
        if (gh.z(str)) {
            return R.string.attachment_video;
        }
        if (gh.y(str)) {
            return R.string.attachment_vcard;
        }
        if (oec.a() && "application/x-end-of-emergency-proto".equals(str)) {
            return R.string.attachment_end_of_emergency;
        }
        if (gh.u(str)) {
            return R.string.attachment_file;
        }
        return R.string.attachment_unsupported_file;
    }

    public static int w(apzk apzkVar) {
        int ordinal = apzkVar.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 2) {
            if (ordinal == 5) {
                return 4;
            }
            Objects.toString(apzkVar);
            throw new IllegalArgumentException("Unexpected action type ".concat(apzkVar.toString()));
        }
        return 3;
    }

    public static int x(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                return 1;
            }
            return 5;
        }
        return 4;
    }

    public static Integer y(int i, Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue() + 1;
        } else {
            i2 = 0;
        }
        if ((i != 0 && (i == 4 || i == 13)) || ((aplf) yrz.b.e()).b.size() <= i2) {
            return null;
        }
        return Integer.valueOf(((aplf) yrz.b.e()).b.d(i2));
    }

    public static /* synthetic */ Integer z(Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        return y(0, num);
    }

    public final /* synthetic */ akul at(SuggestionData suggestionData, amhh amhhVar, aqax aqaxVar) {
        suggestionData.getClass();
        amhhVar.getClass();
        aqaxVar.getClass();
        return aA(suggestionData, amhhVar, aqaxVar);
    }

    public yyb(char[] cArr, short[] sArr) {
    }

    public yyb(Context context, xnv xnvVar) {
        context.getClass();
        xnvVar.getClass();
        new LinkedHashMap();
    }

    public yyb(vcv vcvVar) {
        vcvVar.getClass();
    }

    public yyb(armf armfVar) {
        armfVar.getClass();
    }
}
