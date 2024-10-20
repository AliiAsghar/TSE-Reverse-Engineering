package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.SmsManager;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class d {
    public static /* synthetic */ boolean A(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean B(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return VCardConstants.PROPERTY_NAME;
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static /* synthetic */ ByteBuffer D(ByteBuffer byteBuffer, int i) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 >= position && i2 <= limit) {
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    public static /* synthetic */ void E(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static /* synthetic */ boolean F(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    public static /* synthetic */ void H(boolean z) {
        if (!z) {
        } else {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public static /* synthetic */ String I(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ",");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean L(ParticipantsTable.BindData bindData) {
        if (bindData.O() != null) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ agmh M() {
        return (agmh) qvk.d.c;
    }

    public static /* synthetic */ agnw P() {
        return agnc.d("$primary");
    }

    public static /* synthetic */ boolean R(Object obj, Object obj2) {
        if (!F(obj, obj2)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ ascv T(arqr arqrVar, Object obj) {
        return (ascv) arqrVar.a(obj);
    }

    public static /* synthetic */ String U(arqr arqrVar, Object obj) {
        return (String) arqrVar.a(obj);
    }

    public static /* synthetic */ Boolean V(arqr arqrVar, Object obj) {
        return (Boolean) arqrVar.a(obj);
    }

    public static /* synthetic */ qlo W(arqr arqrVar, Object obj) {
        return (qlo) arqrVar.a(obj);
    }

    public static /* synthetic */ Optional X(arqr arqrVar, Object obj) {
        return (Optional) arqrVar.a(obj);
    }

    public static /* synthetic */ ListenableFuture Y(arqr arqrVar, Object obj) {
        return (ListenableFuture) arqrVar.a(obj);
    }

    public static /* synthetic */ Object Z(Object obj) {
        ((Number) obj).intValue();
        return arnb.a;
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "SIMPLE";
            case 3:
                return "CHOICE";
            case 4:
                return "PLURAL";
            case 5:
                return "SELECT";
            case 6:
                return "SELECTORDINAL";
            default:
                return "null";
        }
    }

    public static /* synthetic */ List aA(miq miqVar, sxt sxtVar) {
        ArrayList arrayList = new ArrayList();
        while (sxtVar.moveToNext()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) sxtVar.cK();
            CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.A(), -1L);
            ConversationIdType z = bindData.z();
            if (z != null) {
                arrayList.add(new mzi(miqVar, coreBugleMessageId, new BugleConversationId(z), Instant.ofEpochMilli(bindData.t()), 0));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void aB(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ void aC(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException((String) obj2);
        }
    }

    public static /* synthetic */ mmi aD(smr smrVar) {
        if (smrVar.ai()) {
            if (smrVar.M() != null || smrVar.N() != null || (smrVar.v() != null && smrVar.L() != null)) {
                return new mmi(smrVar.M(), smrVar.N(), smrVar.v(), smrVar.L());
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ void aE(ParticipantsTable.BindData bindData, slc slcVar) {
        String M = bindData.M();
        M.getClass();
        slcVar.d(Long.parseLong(M));
    }

    public static /* synthetic */ void aF() {
        alok alokVar = new alok();
        alokVar.h("message_id", "index_null_message_id");
        alokVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ float aG(defpackage.cjp r1, int r2, defpackage.cjp r3) {
        /*
            r0 = 3
            boolean r0 = defpackage.a.bA(r2, r0)
            if (r0 == 0) goto Ld
            float r2 = r3.b
            float r1 = r1.d
        Lb:
            float r2 = r2 - r1
            goto L33
        Ld:
            r0 = 4
            boolean r0 = defpackage.a.bA(r2, r0)
            if (r0 == 0) goto L1b
            float r1 = r1.b
            float r2 = r3.d
        L18:
            float r2 = r1 - r2
            goto L33
        L1b:
            r0 = 5
            boolean r0 = defpackage.a.bA(r2, r0)
            if (r0 == 0) goto L27
            float r2 = r3.c
            float r1 = r1.e
            goto Lb
        L27:
            r0 = 6
            boolean r2 = defpackage.a.bA(r2, r0)
            if (r2 == 0) goto L3a
            float r1 = r1.c
            float r2 = r3.e
            goto L18
        L33:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L39
            return r1
        L39:
            return r2
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.aG(cjp, int, cjp):float");
    }

    public static /* synthetic */ long aH(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ int aI(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public static /* synthetic */ Boolean aJ(cxn cxnVar) {
        dgy z = cxnVar.z();
        boolean z2 = false;
        if (z != null && z.a) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public static /* synthetic */ cxn aK(cxn cxnVar, arqr arqrVar) {
        for (cxn t = cxnVar.t(); t != null; t = t.t()) {
            if (((Boolean) arqrVar.a(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static /* synthetic */ void aL() {
        cfb.a();
        throw new armj();
    }

    public static /* synthetic */ boolean aM(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String[] aN() {
        return new String[0];
    }

    public static fdx aP(Context context, cg cgVar, boolean z, boolean z2) {
        int i;
        int t;
        boolean z3;
        cc ccVar = cgVar.T;
        int i2 = 0;
        if (ccVar == null) {
            i = 0;
        } else {
            i = ccVar.f;
        }
        if (z2) {
            if (z) {
                t = cgVar.u();
                z3 = true;
            } else {
                t = cgVar.v();
                z3 = false;
            }
        } else if (z) {
            t = cgVar.s();
            z3 = true;
        } else {
            t = cgVar.t();
            z3 = false;
        }
        boolean z4 = z3;
        cgVar.aj(0, 0, 0, 0);
        ViewGroup viewGroup = cgVar.P;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            cgVar.P.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = cgVar.P;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        cgVar.aH(i, t);
        Animator w = cgVar.w(i, z3, t);
        if (w != null) {
            return new fdx(w);
        }
        if (t == 0) {
            if (i != 0) {
                if (i != 4097) {
                    if (i != 8194) {
                        if (i != 8197) {
                            if (i != 4099) {
                                if (i != 4100) {
                                    i2 = -1;
                                } else if (z3) {
                                    i2 = aR(context, android.R.attr.activityOpenEnterAnimation);
                                } else {
                                    i2 = aR(context, android.R.attr.activityOpenExitAnimation);
                                }
                            } else if (true != z4) {
                                i2 = R.animator.fragment_fade_exit;
                            } else {
                                i2 = R.animator.fragment_fade_enter;
                            }
                        } else if (z3) {
                            i2 = aR(context, android.R.attr.activityCloseEnterAnimation);
                        } else {
                            i2 = aR(context, android.R.attr.activityCloseExitAnimation);
                        }
                    } else if (true != z4) {
                        i2 = R.animator.fragment_close_exit;
                    } else {
                        i2 = R.animator.fragment_close_enter;
                    }
                } else if (true != z4) {
                    i2 = R.animator.fragment_open_exit;
                } else {
                    i2 = R.animator.fragment_open_enter;
                }
            }
        } else {
            i2 = t;
        }
        if (i2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i2);
                    if (loadAnimation != null) {
                        return new fdx(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
                if (loadAnimator != null) {
                    return new fdx(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i2);
                    if (loadAnimation2 != null) {
                        return new fdx(loadAnimation2);
                    }
                } else {
                    throw e2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    public static /* synthetic */ Optional aQ(apwt apwtVar, hmk hmkVar) {
        Long l = (Long) hmkVar.a.b();
        if (((l != null && l.longValue() == 1) || (l != null && l.longValue() == 2)) && ((Optional) apwtVar.b()).isPresent()) {
            return (Optional) apwtVar.b();
        }
        return Optional.empty();
    }

    private static int aR(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static /* synthetic */ agmh ae() {
        return (agmh) qsz.c.d;
    }

    public static /* synthetic */ boolean af(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ uyz ag(URLSpan uRLSpan) {
        if (uRLSpan.getURL().startsWith("tel:")) {
            return uyz.PHONE_NUMBER;
        }
        if (uRLSpan.getURL().startsWith("mailto:")) {
            return uyz.EMAIL_ADDRESS;
        }
        return uyz.WEB_URL;
    }

    public static /* synthetic */ alog ah(alog alogVar, alog alogVar2) {
        if (!alogVar.isEmpty()) {
            int i = ((alsx) alogVar).c;
            alob alobVar = new alob();
            alobVar.j(alogVar);
            Iterator<E> it = alogVar2.iterator();
            while (it.hasNext()) {
                mkc mkcVar = (mkc) it.next();
                alobVar.h(new mkc(mkcVar.a, mkcVar.b + i, mkcVar.c));
            }
            alog g = alobVar.g();
            g.getClass();
            return g;
        }
        return alogVar2;
    }

    public static /* synthetic */ void ai(anq anqVar, bwj bwjVar, int i) {
        anqVar.getClass();
        if ((i & 81) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            amx.a(amv.d(cga.e, 1.0f), bwjVar);
        }
    }

    public static /* synthetic */ boolean aj(List list, String str) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (F(((anw) it.next()).e().toString(), str)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Long ak(Cursor cursor) {
        cursor.getClass();
        return Long.valueOf(cursor.getLong(0));
    }

    public static /* synthetic */ String al(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean am(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }

    public static /* synthetic */ boolean an(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean ao(String str) {
        if (!TextUtils.isEmpty(str) && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String ap(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                sb.append(digit);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ sxp[] aq(sxo sxoVar) {
        return new sxp[]{sxoVar.a, sxoVar.b, sxoVar.i};
    }

    public static /* synthetic */ smv[] ar(smu smuVar) {
        return new smv[]{smuVar.a, smuVar.b};
    }

    public static /* synthetic */ Object as(armf armfVar) {
        armfVar.getClass();
        Object b = armfVar.b();
        b.getClass();
        return b;
    }

    public static /* synthetic */ String[] at() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static /* synthetic */ void au(MessageCoreData messageCoreData, vae vaeVar) {
        messageCoreData.t();
        messageCoreData.j();
        vaeVar.a();
    }

    public static /* synthetic */ unf av() {
        gry gryVar;
        une a = unf.a();
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a.a = gsdVar.a();
        a.d(((Integer) psc.b.e()).intValue());
        if (((Boolean) ((utz) psc.d.get()).e()).booleanValue()) {
            gryVar = gry.EXPONENTIAL;
        } else {
            gryVar = gry.LINEAR;
        }
        a.g(gryVar);
        return a.b();
    }

    public static /* synthetic */ String aw(MessageCoreData messageCoreData) {
        if (((Boolean) vof.b.e()).booleanValue()) {
            return albo.ag(messageCoreData.am());
        }
        return messageCoreData.az();
    }

    public static /* synthetic */ Bundle ax() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabledMMS", true);
        bundle.putBoolean("enabledTransID", false);
        bundle.putBoolean("enabledNotifyWapMMSC", false);
        bundle.putBoolean("aliasEnabled", false);
        bundle.putBoolean("enableMultipartSMS", true);
        bundle.putBoolean("enableSMSDeliveryReports", true);
        bundle.putBoolean("enableGroupMms", true);
        bundle.putBoolean("supportMmsContentDisposition", true);
        bundle.putBoolean("config_cellBroadcastAppLinks", true);
        bundle.putBoolean("sendMultipartSmsAsSeparateMessages", false);
        bundle.putBoolean("supportHttpCharsetHeader", false);
        bundle.putBoolean("groupChatDefaultsToMMS", true);
        bundle.putBoolean("smsEncodingChangeable", true);
        bundle.putBoolean("smsUsesSimpleCharactersOnly", false);
        bundle.putBoolean("allowEnablingWapPushSI", false);
        bundle.putBoolean("enableWapPushSI", false);
        bundle.putBoolean("supportMmsPriority", true);
        bundle.putBoolean("mms_auto_retrieve_enabled_bool", true);
        bundle.putBoolean("mmsRoamingAutoRetrieveByDefault", false);
        bundle.putBoolean("smsDeliveryReportSettingOnByDefault", false);
        bundle.putBoolean("allowChangingMmsRoamingAutoRetrieve", true);
        bundle.putBoolean("useCustomUserAgent", false);
        bundle.putBoolean("allowEditingSmscAddress", false);
        bundle.putInt("maxMessageSize", 307200);
        bundle.putInt("maxImageHeight", 480);
        bundle.putInt("maxImageWidth", 640);
        bundle.putInt("recipientLimit", Integer.MAX_VALUE);
        bundle.putInt("httpSocketTimeout", ge.a);
        bundle.putInt("aliasMinChars", 2);
        bundle.putInt("aliasMaxChars", 48);
        bundle.putInt("smsToMmsTextThreshold", -1);
        bundle.putInt("smsToMmsTextLengthThreshold", -1);
        bundle.putInt("maxMessageTextSize", -1);
        bundle.putInt("maxSubjectLength", 40);
        bundle.putInt("emailGatewaySmsToMmsTextThreshold", -1);
        bundle.putString("uaProfTagName", "x-wap-profile");
        bundle.putString("httpParams", "");
        bundle.putString("emailGatewayNumber", "");
        bundle.putString("naiSuffix", "");
        bundle.putString("hiddenContactsData", "");
        bundle.putString("smsErrorDescMap", "");
        bundle.putString("spamForwardingNumber", "");
        return bundle;
    }

    public static boolean b(int i) {
        if (i != 4 && i != 6) {
            return false;
        }
        return true;
    }

    public static void c(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }

    public static byte[] d(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                try {
                    char c = (char) bArr[i + 1];
                    if (c == '\r') {
                        int i2 = i + 2;
                        if (((char) bArr[i2]) == '\n') {
                            i = i2;
                        } else {
                            c = '\r';
                        }
                    }
                    int digit = Character.digit(c, 16);
                    i += 2;
                    int digit2 = Character.digit((char) bArr[i], 16);
                    if (digit != -1 && digit2 != -1) {
                        byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                    }
                    return null;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return null;
                }
            }
            byteArrayOutputStream.write(b);
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int e(int i) {
        if (i == -1) {
            i = SmsManager.getDefaultSmsSubscriptionId();
        }
        if (i < 0) {
            return -1;
        }
        return i;
    }

    public static Drawable f(Context context, int i) {
        return or.e().c(context, i);
    }

    public static ebi g(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return ebi.c(languageTags);
    }

    public static void h(Configuration configuration, ebi ebiVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(ebiVar.e());
        configuration.setLocales(forLanguageTags);
    }

    public static final String i(int i) {
        if (i != 0) {
            return "bottom";
        }
        return "top";
    }

    public static final String j(int i) {
        if (i != -2) {
            return ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME;
        }
        return ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME;
    }

    public static final Object k(ListenableFuture listenableFuture, arpe arpeVar) {
        try {
            if (listenableFuture.isDone()) {
                return p(listenableFuture);
            }
            arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
            arvpVar.A();
            listenableFuture.c(new gul(listenableFuture, arvpVar, 1), dtv.a);
            arvpVar.d(new rh(listenableFuture, 6));
            return arvpVar.l();
        } catch (ExecutionException e) {
            throw l(e);
        }
    }

    public static final Throwable l(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static ListenableFuture m(dts dtsVar) {
        dtq dtqVar = new dtq();
        dtu dtuVar = new dtu(dtqVar);
        dtqVar.b = dtuVar;
        dtqVar.a = dtsVar.getClass();
        try {
            Object a = dtsVar.a(dtqVar);
            if (a != null) {
                dtqVar.a = a;
            }
        } catch (Exception e) {
            dtuVar.a(e);
        }
        return dtuVar;
    }

    public static /* synthetic */ void n(Appendable appendable, Object obj, arqr arqrVar) {
        if (arqrVar != null) {
            appendable.append((CharSequence) arqrVar.a(obj));
            return;
        }
        if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
                return;
            } else {
                appendable.append(obj.toString());
                return;
            }
        }
        appendable.append((CharSequence) obj);
    }

    public static /* synthetic */ boolean o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object p(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static /* synthetic */ boolean r() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void s(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static /* synthetic */ void t(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static /* synthetic */ int u(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i >= 0 && length >= i && i2 >= 0) {
            loop0: while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        if (z) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            break loop0;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int v(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || length < i || i2 < 0) {
            return -1;
        }
        while (true) {
            boolean z = false;
            while (i2 != 0) {
                if (i >= length) {
                    if (z) {
                        return -1;
                    }
                    return length;
                }
                char charAt = charSequence.charAt(i);
                if (z) {
                    if (!Character.isLowSurrogate(charAt)) {
                        return -1;
                    }
                    i++;
                    i2--;
                } else if (!Character.isSurrogate(charAt)) {
                    i++;
                    i2--;
                } else {
                    if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    }
                    i++;
                    z = true;
                }
            }
            return i;
        }
    }

    public static /* synthetic */ void w(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public static /* synthetic */ int x(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        if (j != j2) {
            return 1;
        }
        return 0;
    }

    public static /* synthetic */ boolean y(int i) {
        if (i >= 100 && i <= 115) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean z(int i) {
        if (i >= 200 && i <= 253) {
            return true;
        }
        return false;
    }
}
