package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.material.snackbar.Snackbar;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lga {
    public static Boolean c;

    public lga() {
    }

    public static /* synthetic */ void A() {
        alok alokVar = new alok();
        alokVar.h("archive_status", "index_null_archive_status");
        alokVar.h("sort_timestamp", "index_null_sort_timestamp");
        alokVar.h("participant_normalized_destination", "index_null_participant_normalized_destination");
        alokVar.h("rcs_session_id", "index_null_rcs_session_id");
        alokVar.h("marked_as_unread", "index_null_marked_as_unread");
        alokVar.b();
    }

    public static alwo B() {
        return (alwo) lbi.a.a();
    }

    public static float C(lax laxVar) {
        int right;
        boolean z;
        View view = laxVar.f.a;
        boolean z2 = true;
        if (!view.getClipToOutline()) {
            view.setClipToOutline(true);
            view.setOutlineProvider(new lav());
        }
        float f = laxVar.g;
        ColorStateList colorStateList = null;
        if (f != brg.a && Math.abs(f) != view.getWidth()) {
            colorStateList = ColorStateList.valueOf(yzc.s(view.getContext()));
        }
        view.setBackgroundTintList(colorStateList);
        laxVar.d.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), laxVar.c);
        int i = (int) (laxVar.a.getResources().getDisplayMetrics().density * 24.0f);
        if (f > brg.a) {
            right = view.getLeft() + i;
        } else {
            right = (view.getRight() - i) - i;
        }
        laxVar.d.translate(right, view.getTop() + ((view.getHeight() - i) / 2));
        laxVar.d.scale(1.0f, 1.0f);
        laxVar.b.getClass();
        Math.abs(f);
        laxVar.e.getWidth();
        laxVar.b.draw(laxVar.d);
        view.invalidateOutline();
        if (!laxVar.i) {
            return brg.a;
        }
        float width = laxVar.j * view.getWidth();
        float f2 = -width;
        if (f >= f2 && f <= width) {
            z = false;
        } else {
            z = true;
        }
        float f3 = laxVar.h;
        if (f3 >= f2 && f3 <= width) {
            z2 = false;
        }
        if (z != z2) {
            view.performHapticFeedback(4);
        }
        return f;
    }

    public static void D(Activity activity, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        View findViewById = activity.findViewById(R.id.start_chat_fab);
        Snackbar r = Snackbar.r(activity, activity.getWindow().getDecorView().getRootView(), charSequence);
        if (findViewById != null) {
            r.m(findViewById);
            r.l = true;
        }
        if (!TextUtils.isEmpty(charSequence2) && onClickListener != null) {
            r.s(charSequence2, onClickListener);
        }
        r.i();
    }

    public static void E(Activity activity, CharSequence charSequence) {
        D(activity, charSequence, null, null);
    }

    public static kzh F(alor alorVar, Integer num, ngh nghVar) {
        return new kzh(alorVar, num, nghVar);
    }

    public static boolean G(kzd kzdVar) {
        return rtp.c(kzdVar.G, kzdVar.M);
    }

    public static boolean H(int i) {
        if (i == 4) {
            return true;
        }
        return false;
    }

    public static boolean I(int i) {
        if (uyh.a() && H(i)) {
            return true;
        }
        return false;
    }

    public static boolean J(boolean z, int i) {
        if (!rtp.c(z, i)) {
            return true;
        }
        return false;
    }

    public static boolean K(kzd kzdVar) {
        boolean z = false;
        if (!I(kzdVar.R)) {
            boolean z2 = kzdVar.Y;
            boolean z3 = kzdVar.E;
            boolean z4 = kzdVar.G;
            int i = kzdVar.M;
            if (kzdVar.Z > 0) {
                z = true;
            }
            return rtp.f(z2, z4, i, z);
        }
        if (kzdVar.Y) {
            return false;
        }
        return kzdVar.E;
    }

    public static SelectedConversation L(kzx kzxVar) {
        boolean z;
        kzd kzdVar = kzxVar.a;
        ConversationIdType conversationIdType = kzdVar.l;
        ConversationId conversationId = (ConversationId) kzdVar.m.get();
        MessageIdType messageIdType = kzdVar.o;
        long j = kzdVar.L;
        long j2 = kzdVar.P;
        tqc tqcVar = kzdVar.a;
        int i = kzdVar.c;
        boolean z2 = kzdVar.k;
        String str = kzdVar.n;
        String str2 = kzdVar.z;
        String str3 = kzdVar.x;
        String str4 = kzdVar.y;
        boolean z3 = kzdVar.Q;
        int i2 = kzdVar.R;
        String str5 = kzdVar.V;
        int i3 = kzdVar.N;
        String str6 = kzdVar.q;
        boolean K = K(kzdVar);
        int i4 = kzdVar.ab;
        mmy mmyVar = kzdVar.ac;
        boolean z4 = kzdVar.ad;
        if (kzxVar.p == 8) {
            z = true;
        } else {
            z = false;
        }
        return new SelectedConversation(conversationIdType, conversationId, messageIdType, j, j2, tqcVar, i, z2, z, str, str2, str3, str4, kzxVar.u, z3, i2, str5, i3, str6, K, i4, mmyVar, z4);
    }

    public static void M(View view, int i, boolean z) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_list_fab_margin_bottom_end);
        if (z) {
            dimensionPixelSize += i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize;
    }

    public static void N(aiuc aiucVar, kvw kvwVar) {
        aktp.H(aiucVar, aahz.class, new ixl(kvwVar, 20));
        aktp.H(aiucVar, kxj.class, new kwf(kvwVar, 1));
        aktp.H(aiucVar, aahy.class, new kwf(kvwVar, 0));
        aktp.H(aiucVar, aaia.class, new kwf(kvwVar, 2));
        aktp.H(aiucVar, yyd.class, new kwf(kvwVar, 3));
        aktp.H(aiucVar, kxi.class, new kwf(kvwVar, 4));
        aktp.H(aiucVar, iho.class, new kwf(kvwVar, 5));
    }

    public static void O(Activity activity, Toolbar toolbar, en enVar, int i) {
        View findViewById = toolbar.findViewById(R.id.lockup);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        yzc.p(activity, enVar, i);
        enVar.setHomeActionContentDescription(activity.getResources().getString(R.string.navigate_up_button_content_description));
        enVar.setDisplayShowTitleEnabled(true);
        enVar.setDisplayHomeAsUpEnabled(true);
        enVar.setHomeAsUpIndicator((Drawable) null);
        enVar.setBackgroundDrawable(new ColorDrawable(activity.getColor(R.color.color_primary_background_alpha96)));
        activity.getWindow().setStatusBarColor(activity.getColor(R.color.color_primary_background_alpha96));
        enVar.show();
    }

    public static /* synthetic */ boolean P(Object obj) {
        AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
        if (advancedFeedbackDataView.f().isPresent() && advancedFeedbackDataView.g() && (advancedFeedbackDataView.f().get() instanceof kss)) {
            return true;
        }
        return false;
    }

    public static void Q(kzg kzgVar, enh enhVar, ahiy ahiyVar) {
        uac.u((ncq) kzgVar.c().b(), kzgVar.d(), enhVar, ahiyVar);
    }

    public static void R(kuz kuzVar, ConversationId conversationId, lrf lrfVar, boolean z) {
        kuzVar.l(conversationId, rvc.a, lrfVar, z);
    }

    public static void S(cj cjVar, agxw agxwVar, String str, uye uyeVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("conversation_list_mode", uyeVar.d);
        kux a = kux.a(agxwVar.n());
        a.ak(bundle);
        bd bdVar = new bd(cjVar.a());
        bdVar.v(R.id.home_fragment_container, a, str);
        bdVar.b();
    }

    public static void T(ngx ngxVar) {
        ngxVar.h();
    }

    public static int U(int i) {
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static SelfIdentityId V(String str) {
        str.getClass();
        return new SelfIdentityIdImpl(str, null, 2, null);
    }

    public static SelfIdentityId W(String str) {
        if (str == null) {
            return null;
        }
        return V(str);
    }

    @armg
    public static String X(SelfIdentityId selfIdentityId) {
        if (selfIdentityId != null) {
            return selfIdentityId.b();
        }
        return null;
    }

    public static String Y(SelfIdentityId selfIdentityId) {
        if (selfIdentityId != null) {
            return selfIdentityId.toString();
        }
        return null;
    }

    public static nfb Z(psv psvVar) {
        psvVar.getClass();
        return new nfb(psvVar.h(), psvVar.g(), psvVar.i(), psvVar.f(), psvVar.h(), psvVar.k(), false, false, false, false, Integer.parseInt("0"), false, false, false, false, false, false);
    }

    public static ChipData a(mmj mmjVar) {
        boolean z;
        ConversationId conversationId = mmjVar.a;
        conversationId.getClass();
        ChipId.Conversation conversation = new ChipId.Conversation(conversationId);
        String str = mmjVar.b;
        str.getClass();
        if (mmjVar.d <= 1) {
            z = true;
        } else {
            z = false;
        }
        return new ChipData(conversation, str, null, mmjVar.e, z);
    }

    public static int aA(alog alogVar, mjb mjbVar, arqr arqrVar) {
        int size = alogVar.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            Object obj = alogVar.get(i2);
            obj.getClass();
            mjb mjbVar2 = (mjb) arqrVar.a(obj);
            if (mjbVar.compareTo(mjbVar2) < 0) {
                i = i2 + 1;
            } else if (mjbVar.compareTo(mjbVar2) > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return i;
    }

    public static Instant aB(List list) {
        Instant h;
        miz mizVar = (miz) aqjn.Z(list);
        if (mizVar != null && (h = mizVar.h()) != null) {
            return h;
        }
        Instant instant = Instant.MIN;
        instant.getClass();
        return instant;
    }

    public static /* synthetic */ String aC(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "null";
                        }
                        return "PROCESSING";
                    }
                    return "HIDE_AND_REQUIRE_EXTRA_CONSENT_BEFORE_SHOWING";
                }
                return "HIDE_AND_ALLOW_SHOWING";
            }
            return "DISPLAY_AND_ALLOW_HIDING";
        }
        return "DISPLAY";
    }

    public static String aD(Context context) {
        context.getClass();
        return String.valueOf(context.getPackageName()).concat(".fileprovider");
    }

    public static boolean aE(mxf mxfVar) {
        if (!mxfVar.d().equals(Uri.EMPTY) && Objects.equals(mxfVar.d().getAuthority(), "mms")) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ hgi aF(aozy aozyVar) {
        aozyVar.getClass();
        return new hgi(aozyVar);
    }

    public static /* bridge */ /* synthetic */ hgi aG(ParticipantsTable.BindData bindData) {
        bindData.getClass();
        return new hgi(bindData, (byte[]) null);
    }

    public static /* bridge */ /* synthetic */ hgi aH(ParticipantsTable.BindData bindData) {
        bindData.getClass();
        return new hgi(bindData, (byte[]) null);
    }

    public static void aI(kzg kzgVar, aohs aohsVar, uac uacVar, kyf kyfVar, final AtomicBoolean atomicBoolean) {
        final apwt c2 = kzgVar.c();
        final kzf b = kzgVar.b();
        aohsVar.C(new akfk((ansy) uacVar.a, new ancu() { // from class: trb
            @Override // defpackage.ancu
            public final andc a(ahmn ahmnVar) {
                akul b2;
                if (!atomicBoolean.get()) {
                    b2 = aktp.ag(b);
                } else {
                    b2 = ((ncq) apwt.this.b()).b();
                }
                return new andc(b2);
            }
        }, kzgVar.d(), 2), kzgVar.e(kyfVar));
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [alhr, java.lang.Object] */
    public static void aJ(Activity activity, Intent intent) {
        acak acakVar = new acak(activity);
        if (intent.getAction().equals("com.google.android.gms.googlehelp.HELP") && intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            int a = acakVar.a();
            if (a == 0) {
                Object obj = acakVar.b.get();
                acbd acbdVar = (acbd) obj;
                abhg.m(acbdVar.a);
                abrg abrgVar = ((abrc) obj).i;
                acat acatVar = new acat(abrgVar, intent, new WeakReference(acbdVar.a));
                abrgVar.b(acatVar);
                abhg.o(acatVar);
                return;
            }
            acakVar.b(a, (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"));
            return;
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }

    public static acir aK(Context context, FeedbackOptions feedbackOptions) {
        return new abrc(context).m(feedbackOptions);
    }

    public static void aL(aiub aiubVar, kor korVar) {
        aktp.G(aiubVar, koq.class, new ixl(korVar, 16));
    }

    public static void aM(aiuc aiucVar, kma kmaVar) {
        aktp.H(aiucVar, kmf.class, new ixl(kmaVar, 13));
        aktp.H(aiucVar, klq.class, new ixl(kmaVar, 14));
        aktp.H(aiucVar, kmn.class, new ixl(kmaVar, 15));
    }

    public static alog aN() {
        return alog.t(new klg(1), new klg(0), new kld());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int[][] aO(alog alogVar, alog alogVar2) {
        int size = alogVar.size() + 1;
        int i = ((alsx) alogVar2).c + 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, size, i);
        iArr[0][0] = 0;
        for (int i2 = 1; i2 < size; i2++) {
            iArr[i2][0] = i2;
        }
        for (int i3 = 1; i3 < i; i3++) {
            iArr[0][i3] = i3;
        }
        for (int i4 = 1; i4 < size; i4++) {
            int i5 = i4 - 1;
            kkz kkzVar = (kkz) alogVar.get(i5);
            for (int i6 = 1; i6 < i; i6++) {
                int i7 = i6 - 1;
                int i8 = !kkzVar.equals((kkz) alogVar2.get(i7)) ? 1 : 0;
                int[] iArr2 = iArr[i4];
                int[] iArr3 = iArr[i5];
                int i9 = iArr3[i7] + i8;
                int i10 = iArr3[i6] + 1;
                int i11 = iArr2[i7] + 1;
                if (i9 >= i10 || i9 >= i11) {
                    if (i10 < i11) {
                        i9 = i10;
                    } else {
                        i9 = i11;
                    }
                }
                iArr2[i6] = i9;
            }
        }
        return iArr;
    }

    public static void aQ(aezh aezhVar, aap aapVar, bwj bwjVar, int i) {
        bwj c2 = bwjVar.c(-336694401);
        c2.y(-1145763883);
        bwk bwkVar = (bwk) c2;
        Object T = bwkVar.T();
        Object obj = T;
        if (T == bwj.a.a) {
            abd abdVar = new abd(false);
            abdVar.d(true);
            bwkVar.ad(abdVar);
            obj = abdVar;
        }
        abd abdVar2 = (abd) obj;
        bwkVar.Y();
        c2.y(-1145757226);
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            T2 = jyp.k;
            bwkVar.ad(T2);
        }
        bwkVar.Y();
        wf.f(abdVar2, null, wx.b(aapVar, (arqr) T2), null, null, cdk.e(-826734681, new jjs(aezhVar, 14), c2), c2, 196608);
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(aezhVar, aapVar, i, 9);
        }
    }

    public static void aR(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        arqgVar.getClass();
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1330771994);
        if (i4 == 0) {
            if (true != c2.I(arqgVar)) {
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
            bxl.c(arqgVar, new kjs((enm) c2.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), arqgVar, 0), c2);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(arqgVar, i, 1);
        }
    }

    public static void aS(aezh aezhVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(531409262);
        if (i4 == 0) {
            if (true != c2.G(aezhVar)) {
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
            adom.cj(aezhVar, dea.a(cgh.a(cga.e, 2.0f), "results_bar"), c2, (i2 & 14) | 48);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(aezhVar, i, 0);
        }
    }

    public static void aT(kjr kjrVar, cga cgaVar, bsc bscVar, bwj bwjVar, int i) {
        int i2;
        boolean booleanValue;
        bwk bwkVar;
        int i3;
        List list;
        boolean booleanValue2;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c2 = bwjVar.c(-1639834145);
        if (i7 == 0) {
            if (true != c2.G(kjrVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c2.G(bscVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i2 & 731) == 146 && c2.L()) {
            c2.v();
        } else {
            cas a = cak.a(kjrVar.b, c2);
            cak.a(kjrVar.a, c2);
            cas a2 = cak.a(kjrVar.c, c2);
            cas a3 = cak.a(kjrVar.d, c2);
            cas a4 = cak.a(kjrVar.e, c2);
            c2.y(294015516);
            booleanValue = ((Boolean) a4.a()).booleanValue();
            if (booleanValue && cm(a) != null) {
                afaw cm = cm(a);
                cm.getClass();
                afaw cm2 = cm(a);
                cm2.getClass();
                a.bS(cm.b.f, cm2.b.j, c2, 0, 0);
            }
            bwk bwkVar2 = (bwk) c2;
            bwkVar2.Y();
            c2.y(294025269);
            int i8 = i2 & 14;
            Object T = bwkVar2.T();
            if (i8 == 4 || T == bwj.a.a) {
                T = new kju(kjrVar, 0);
                bwkVar2.ad(T);
            }
            bwkVar2.Y();
            cga a5 = cur.a(cgaVar, (arqr) T);
            ajw.e eVar = ajw.c;
            int i9 = cfq.a;
            cue a6 = akk.a(eVar, cfq.a.m, c2, 0);
            int a7 = bwg.a(c2);
            byx P = bwkVar2.P();
            cga b = cfv.b(c2, a5);
            int i10 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar2.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a6, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a7))) {
                Integer valueOf = Integer.valueOf(a7);
                bwkVar2.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            c2.y(-1970310726);
            afaw cm3 = cm(a);
            if (cm3 != null) {
                cga a8 = cgh.a(cga.e, 3.0f);
                booleanValue2 = ((Boolean) a4.a()).booleanValue();
                int i11 = (i2 & 896) | 48;
                bwkVar = bwkVar2;
                i3 = 48;
                adom.bx(cm3, a8, bscVar, null, (!booleanValue2) & (c2.g(lyb.a) instanceof yyx), c2, i11, 8);
            } else {
                bwkVar = bwkVar2;
                i3 = 48;
            }
            bwkVar.Y();
            aezh aezhVar = (aezh) a2.a();
            c2.y(-1587568848);
            if (aezhVar != null) {
                aap aapVar = adom.bZ(c2).e;
                c2.y(1418392460);
                aQ(aezhVar, aapVar, c2, 64);
                bwkVar.Y();
            }
            bwkVar.Y();
            hlc.A((idz) a3.a(), cgh.a(cga.e, 1.0f), c2, i3);
            c2.p();
            c2.y(526112588);
            afaw cm4 = cm(a);
            if (cm4 != null) {
                list = new ArrayList();
                Iterator it = cm4.c.iterator();
                while (it.hasNext()) {
                    arqg arqgVar2 = ((aehz) it.next()).i;
                    if (arqgVar2 != null) {
                        list.add(arqgVar2);
                    }
                }
            } else {
                list = arnv.a;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                aR((arqg) it2.next(), c2, 0);
            }
            bwkVar.Y();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) kjrVar, (Object) cgaVar, (Object) bscVar, i, 8, (byte[]) null);
        }
    }

    public static void aU(kje kjeVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(1906186501);
        if (i4 == 0) {
            if (true != c2.G(kjeVar)) {
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
            c2.y(-146132419);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(false, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            aV(kjeVar, bynVar, c2, (i2 & 14) | 48);
            if (((Boolean) bynVar.a()).booleanValue()) {
                throw null;
            }
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kjeVar, i, 20);
        }
    }

    public static void aV(kje kjeVar, byn bynVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-737453001);
        boolean z = true;
        if (i5 == 0) {
            if (true != c2.G(kjeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(bynVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            }
            c2.n();
            if (Build.VERSION.SDK_INT >= 35) {
                z = false;
            }
            dsu.c(null, null, new dtn(false, z, 7), cdk.e(-815844454, new eif(17), c2), c2, 24576, 7);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(kjeVar, bynVar, i, 8);
        }
    }

    public static void aW(kiu kiuVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-436969710);
        if (i5 == 0) {
            if (true != c2.G(kiuVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            String a = dga.a(R.string.bottom_sheets_videocalling_meet_setup_heading, c2);
            String a2 = dga.a(R.string.bottom_sheets_videocalling_meet_setup_body, c2);
            String a3 = dga.a(R.string.bottom_sheets_videocalling_set_up_meet, c2);
            c2.y(423595701);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new kjm(kiuVar, 1);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            aeke.Z(new aemb(a, new aewr(a3, (arqg) T), new aewr(dga.a(R.string.bottom_sheets_videocalling_no_thanks, c2), kiuVar.a), a2, (List) null, new aews(R.drawable.setup_meet_prompt_graphic), (aelt) null, kiuVar.a, 912), cgaVar, c2, i2 & 112, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(kiuVar, cgaVar, i, 7);
        }
    }

    public static void aX(kit kitVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(1368200106);
        if (i5 == 0) {
            if (true != c2.G(kitVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            String b = dga.b(R.string.bottom_sheets_videocalling_invite_heading, new Object[]{kitVar.a}, c2);
            String a = dga.a(R.string.bottom_sheets_videocalling_send_invite, c2);
            c2.y(1147102525);
            int i6 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i6 == 4 || T == bwj.a.a) {
                T = new kdz(kitVar, 20);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            aeke.Z(new aemb(b, new aewr(a, (arqg) T), new aewr(dga.a(R.string.bottom_sheets_videocalling_no_thanks, c2), kitVar.b), (String) null, (List) null, new aews(R.drawable.invite_link_prompt_graphic), (aelt) null, kitVar.b, 920), cgaVar, c2, i2 & 112, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(kitVar, cgaVar, i, 6);
        }
    }

    public static void aY(kis kisVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1685954793);
        if (i4 == 0) {
            if (true != c2.G(kisVar)) {
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
            amj h = amh.h(brg.a, 30.0f, brg.a, 20.0f, 5);
            c2.y(1572464740);
            int i5 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new kju(kisVar, 1);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            anp.a(null, null, h, false, null, null, null, false, (arqr) T, c2, 384, 251);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kisVar, i, 19);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public static kpo aZ(Class cls, Optional optional, Optional optional2, iew iewVar) {
        anen anenVar = (anen) iewVar.a.b();
        anenVar.getClass();
        return new kpo(cls, anenVar, optional, optional2);
    }

    public static nfb aa(qry qryVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String a;
        Integer u;
        boolean z6;
        int parseInt;
        boolean z7;
        boolean z8;
        boolean z9;
        String a2;
        Integer u2;
        String a3;
        Boolean bool;
        String a4;
        Integer u3;
        Integer u4;
        String a5;
        Integer u5;
        String a6;
        Integer u6;
        String a7;
        Integer u7;
        qryVar.getClass();
        boolean f = qryVar.f();
        boolean e = qryVar.e();
        boolean c2 = qryVar.c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
        if (!qryVar.e() && !qryVar.f()) {
            z = false;
        } else {
            z = true;
        }
        boolean f2 = qryVar.f();
        if (qryVar.c("video") && qryVar.c("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (qryVar.c("theme") && (a7 = qryVar.a("theme")) != null && (u7 = arsd.u(a7)) != null && u7.intValue() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (qryVar.c("image-caption") && (a6 = qryVar.a("image-caption")) != null && (u6 = arsd.u(a6)) != null && u6.intValue() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((anfi.a("bugle.enable_edit_when_extended_messaging_available", "bugle") && qryVar.c("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.msg.extended")) || (qryVar.c("rcs-edit") && (a = qryVar.a("rcs-edit")) != null && (u = arsd.u(a)) != null && u.intValue() > 0)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (qryVar.c("laxqkzc") && (a5 = qryVar.a("laxqkzc")) != null && (u5 = arsd.u(a5)) != null && u5.intValue() > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        String a8 = qryVar.a("mms-group-upgrade");
        if (a8 != null && (u4 = arsd.u(a8)) != null) {
            parseInt = u4.intValue();
        } else {
            parseInt = Integer.parseInt("0");
        }
        if (qryVar.c("profile-version") && (a4 = qryVar.a("profile-version")) != null && (u3 = arsd.u(a4)) != null && u3.intValue() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (qryVar.c("profile-signed-in") && (a3 = qryVar.a("profile-signed-in")) != null) {
            if (d.F(a3, "true")) {
                bool = true;
            } else if (d.F(a3, "false")) {
                bool = false;
            } else {
                bool = null;
            }
            if (bool != null) {
                z8 = bool.booleanValue();
                boolean z10 = z7;
                int i = parseInt;
                Object orElse = vbe.ETOUFFEE.c().map(new nfc(new lnn(qryVar, 17), 1)).orElse(false);
                orElse.getClass();
                boolean booleanValue = ((Boolean) orElse).booleanValue();
                Object orElse2 = vbe.ETOUFFEE_GROUPS.c().map(new ndf(new lnn(qryVar, 18), 20)).orElse(false);
                orElse2.getClass();
                boolean booleanValue2 = ((Boolean) orElse2).booleanValue();
                boolean c3 = qryVar.c("+zinnia-version");
                if (!qryVar.c("voice_moods") && (a2 = qryVar.a("voice_moods")) != null && (u2 = arsd.u(a2)) != null && u2.intValue() > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return new nfb(f, e, c2, z, f2, z2, z3, z4, z5, z6, i, z10, z8, booleanValue, booleanValue2, c3, z9);
            }
        }
        z8 = false;
        boolean z102 = z7;
        int i2 = parseInt;
        Object orElse3 = vbe.ETOUFFEE.c().map(new nfc(new lnn(qryVar, 17), 1)).orElse(false);
        orElse3.getClass();
        boolean booleanValue3 = ((Boolean) orElse3).booleanValue();
        Object orElse22 = vbe.ETOUFFEE_GROUPS.c().map(new ndf(new lnn(qryVar, 18), 20)).orElse(false);
        orElse22.getClass();
        boolean booleanValue22 = ((Boolean) orElse22).booleanValue();
        boolean c32 = qryVar.c("+zinnia-version");
        if (!qryVar.c("voice_moods")) {
        }
        z9 = false;
        return new nfb(f, e, c2, z, f2, z2, z3, z4, z5, z6, i2, z102, z8, booleanValue3, booleanValue22, c32, z9);
    }

    public static void ab(ndy ndyVar, skz skzVar, boolean z) {
        agmq n = skzVar.n();
        try {
            skx skxVar = (skx) n;
            if (z) {
                while (skxVar.moveToNext()) {
                    ndyVar.a.add(new BugleConversationId(skxVar.f()));
                }
            } else if (skxVar.moveToNext()) {
                ndyVar.a.add(new BugleConversationId(skxVar.f()));
            }
            armd.i(n, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(n, th);
                throw th2;
            }
        }
    }

    public static void ac(ndy ndyVar, sml smlVar, boolean z) {
        agmq n = smlVar.n();
        try {
            smj smjVar = (smj) n;
            if (z) {
                while (smjVar.moveToNext()) {
                    ndyVar.a.add(new BugleConversationId(smjVar.f()));
                }
            } else if (smjVar.moveToNext()) {
                ndyVar.a.add(new BugleConversationId(smjVar.f()));
            }
            armd.i(n, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(n, th);
                throw th2;
            }
        }
    }

    public static void ad(ndy ndyVar, boolean z, taz tazVar) {
        agmq n = tazVar.b().n();
        try {
            tav tavVar = (tav) n;
            if (tavVar.moveToNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) tavVar.cK();
                if (bindData.p() > -2) {
                    ndyVar.b.set(true);
                } else {
                    akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::queryAndProcessParticipantResults_dsdrGroupsFlag");
                    int i = 0;
                    try {
                        if (z) {
                            String[] strArr = smp.a;
                            smh[] smhVarArr = (smh[]) bindData.au("conversation_to_participants", new smh[0]);
                            smhVarArr.getClass();
                            int length = smhVarArr.length;
                            while (i < length) {
                                ndyVar.a.add(new BugleConversationId(smhVarArr[i].l()));
                                i++;
                            }
                        } else {
                            String[] strArr2 = sld.a;
                            sku[] skuVarArr = (sku[]) bindData.au("conversation_participants", new sku[0]);
                            skuVarArr.getClass();
                            int length2 = skuVarArr.length;
                            while (i < length2) {
                                ndyVar.a.add(new BugleConversationId(skuVarArr[i].l()));
                                i++;
                            }
                        }
                        armd.i(e, null);
                    } finally {
                    }
                }
            }
            armd.i(n, null);
        } finally {
        }
    }

    public static void ae(ndy ndyVar, boolean z, taz tazVar) {
        agmq n = tazVar.b().n();
        try {
            tav tavVar = (tav) n;
            while (tavVar.moveToNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) tavVar.cK();
                if (bindData.p() > -2) {
                    ndyVar.b.set(true);
                } else {
                    akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::queryAndProcessParticipantResultsV2_dsdrGroupsFlag");
                    int i = 0;
                    if (z) {
                        try {
                            String[] strArr = smp.a;
                            smh[] smhVarArr = (smh[]) bindData.au("conversation_to_participants", new smh[0]);
                            smhVarArr.getClass();
                            int length = smhVarArr.length;
                            while (i < length) {
                                ndyVar.a.add(new BugleConversationId(smhVarArr[i].l()));
                                i++;
                            }
                        } finally {
                        }
                    } else {
                        String[] strArr2 = sld.a;
                        sku[] skuVarArr = (sku[]) bindData.au("conversation_participants", new sku[0]);
                        skuVarArr.getClass();
                        int length2 = skuVarArr.length;
                        while (i < length2) {
                            ndyVar.a.add(new BugleConversationId(skuVarArr[i].l()));
                            i++;
                        }
                    }
                    armd.i(e, null);
                }
            }
            armd.i(n, null);
        } finally {
        }
    }

    public static void af(ndy ndyVar, boolean z, tdj tdjVar) {
        agmq n = tdjVar.b().n();
        try {
            tdh tdhVar = (tdh) n;
            if (tdhVar.moveToNext()) {
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) tdhVar.cK();
                akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::queryAndProcessProfileResults_dsdrGroupsFlag");
                int i = 0;
                try {
                    if (z) {
                        String[] strArr = smp.a;
                        smh[] smhVarArr = (smh[]) bindData.au("conversation_to_participants", new smh[0]);
                        smhVarArr.getClass();
                        int length = smhVarArr.length;
                        while (i < length) {
                            ndyVar.a.add(new BugleConversationId(smhVarArr[i].l()));
                            i++;
                        }
                    } else {
                        String[] strArr2 = sld.a;
                        sku[] skuVarArr = (sku[]) bindData.au("conversation_participants", new sku[0]);
                        skuVarArr.getClass();
                        int length2 = skuVarArr.length;
                        while (i < length2) {
                            ndyVar.a.add(new BugleConversationId(skuVarArr[i].l()));
                            i++;
                        }
                    }
                    armd.i(e, null);
                } finally {
                }
            }
            armd.i(n, null);
        } finally {
        }
    }

    public static void ag(ndy ndyVar, boolean z, tdj tdjVar) {
        agmq n = tdjVar.b().n();
        try {
            tdh tdhVar = (tdh) n;
            while (tdhVar.moveToNext()) {
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) tdhVar.cK();
                akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::queryAndProcessProfileResultsV2_dsdrGroupsFlag");
                int i = 0;
                if (z) {
                    try {
                        String[] strArr = smp.a;
                        smh[] smhVarArr = (smh[]) bindData.au("conversation_to_participants", new smh[0]);
                        smhVarArr.getClass();
                        int length = smhVarArr.length;
                        while (i < length) {
                            ndyVar.a.add(new BugleConversationId(smhVarArr[i].l()));
                            i++;
                        }
                    } finally {
                    }
                } else {
                    String[] strArr2 = sld.a;
                    sku[] skuVarArr = (sku[]) bindData.au("conversation_participants", new sku[0]);
                    skuVarArr.getClass();
                    int length2 = skuVarArr.length;
                    while (i < length2) {
                        ndyVar.a.add(new BugleConversationId(skuVarArr[i].l()));
                        i++;
                    }
                }
                armd.i(e, null);
            }
            armd.i(n, null);
        } finally {
        }
    }

    public static void ah(ndy ndyVar, boolean z, taz tazVar) {
        agmq n = tazVar.b().n();
        try {
            tav tavVar = (tav) n;
            if (tavVar.moveToNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) tavVar.cK();
                if (bindData.p() > -2) {
                    ndyVar.b.set(true);
                } else {
                    akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::queryAndProcessResults_dsdrGroupsFlag");
                    int i = 0;
                    try {
                        if (z) {
                            String[] strArr = smp.a;
                            smh[] smhVarArr = (smh[]) bindData.au("conversation_to_participants", new smh[0]);
                            smhVarArr.getClass();
                            int length = smhVarArr.length;
                            while (i < length) {
                                ndyVar.a.add(new BugleConversationId(smhVarArr[i].l()));
                                i++;
                            }
                        } else {
                            String[] strArr2 = sld.a;
                            sku[] skuVarArr = (sku[]) bindData.au("conversation_participants", new sku[0]);
                            skuVarArr.getClass();
                            int length2 = skuVarArr.length;
                            while (i < length2) {
                                ndyVar.a.add(new BugleConversationId(skuVarArr[i].l()));
                                i++;
                            }
                        }
                        armd.i(e, null);
                    } finally {
                    }
                }
            }
            armd.i(n, null);
        } finally {
        }
    }

    public static void ai(ndy ndyVar, boolean z, taz tazVar) {
        agmq n = tazVar.b().n();
        try {
            tav tavVar = (tav) n;
            while (tavVar.moveToNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) tavVar.cK();
                if (bindData.p() > -2) {
                    ndyVar.b.set(true);
                } else {
                    akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::queryAndProcessResultsV2_dsdrGroupsFlag");
                    int i = 0;
                    if (z) {
                        try {
                            String[] strArr = smp.a;
                            smh[] smhVarArr = (smh[]) bindData.au("conversation_to_participants", new smh[0]);
                            smhVarArr.getClass();
                            int length = smhVarArr.length;
                            while (i < length) {
                                ndyVar.a.add(new BugleConversationId(smhVarArr[i].l()));
                                i++;
                            }
                        } finally {
                        }
                    } else {
                        String[] strArr2 = sld.a;
                        sku[] skuVarArr = (sku[]) bindData.au("conversation_participants", new sku[0]);
                        skuVarArr.getClass();
                        int length2 = skuVarArr.length;
                        while (i < length2) {
                            ndyVar.a.add(new BugleConversationId(skuVarArr[i].l()));
                            i++;
                        }
                    }
                    armd.i(e, null);
                }
            }
            armd.i(n, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void aj(taz tazVar, tba tbaVar) {
        alur it = tbaVar.e.iterator();
        while (it.hasNext()) {
            agpw agpwVar = (agpw) it.next();
            agpwVar.getClass();
            tazVar.k((tbc) agpwVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void ak(tdj tdjVar, tdk tdkVar) {
        alur it = tdkVar.e.iterator();
        while (it.hasNext()) {
            agpw agpwVar = (agpw) it.next();
            agpwVar.getClass();
            tdjVar.k((tdl) agpwVar);
        }
    }

    public static void al(taz tazVar, boolean z) {
        akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::withConversationIds_participantsTable_dsdrGroupsFlag");
        try {
            if (z) {
                tazVar.D(agoh.b(new smm(smp.a).b(), (agmh) smp.d.c, ParticipantsTable.c.a).a());
            } else {
                tazVar.D(agoh.b(sld.a().b(), (agmh) sld.e.e, ParticipantsTable.c.a).a());
            }
            armd.i(e, null);
        } finally {
        }
    }

    public static void am(tdj tdjVar, boolean z) {
        akrh e = aktp.e("StatelessParticipantChangeQueryListenerFactory::withConversationIds_profilesTable_dsdrGroupsFlag");
        try {
            if (z) {
                tdjVar.D(agoh.b(new smm(smp.a).b(), (agmh) smp.d.c, (agmh) ProfilesTable.c.b).a());
            } else {
                tdjVar.D(agoh.b(sld.a().b(), (agmh) sld.e.e, (agmh) ProfilesTable.c.b).a());
            }
            armd.i(e, null);
        } finally {
        }
    }

    public static boolean an(ansy ansyVar) {
        return ansyVar.e("bugle.stop_restoring_to_telephony_db");
    }

    public static boolean ao(ansy ansyVar) {
        return ansyVar.e("bugle.stop_restoring_conversations_to_telephony_db");
    }

    public static /* synthetic */ tas[] ap(tar tarVar) {
        return new tas[]{tarVar.a, tarVar.d};
    }

    public static /* synthetic */ tdf[] aq(tde tdeVar) {
        return new tdf[]{(tdf) tdeVar.a, (tdf) tdeVar.b};
    }

    public static boolean ar(amfd amfdVar) {
        d.t(!Objects.equals(amfdVar, amfd.UNKNOWN_LATCH_REASON), "unknown fallback latch reason");
        if (Objects.equals(amfdVar, amfd.DEBUG_MENU_COMMAND_FAIL_SEND) || Objects.equals(amfdVar, amfd.MANUAL_RETRY_FORCES_FALLBACK) || Objects.equals(amfdVar, amfd.DITTO_CHANNEL_RESEND)) {
            return true;
        }
        return false;
    }

    public static asai as(ncq ncqVar) {
        return new lhh(armd.m(new asac(new lfn(ncqVar, (arpe) null, 5))), 6);
    }

    public static /* synthetic */ tqy at(ncq ncqVar, arwe arweVar) {
        int i = ascp.a;
        ascp ascpVar = asco.a;
        ncqVar.getClass();
        return new ncm(ncqVar, arweVar, ascpVar);
    }

    public static nba au(nfw nfwVar, Context context, atok atokVar) {
        String string = context.getString(R.string.you_name);
        string.getClass();
        return new nba(string, nfwVar.c(), nfwVar, atokVar);
    }

    public static nbb av(nbg nbgVar, List list, boolean z) {
        return new nbb(nbgVar, list.size(), z, alzz.aZ(list));
    }

    public static nbb aw(nbb nbbVar, nfw nfwVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : nbbVar.c) {
            if (!((nba) obj).c.r(nfwVar.f())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return av(nbbVar.a, arrayList, false);
    }

    public static mix ax(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4 && i != 5 && i != 6 && i != 7 && i != 10) {
                    if (i != 11) {
                        if (i != 14 && i != 15) {
                            if (i != 20) {
                                return mix.ERROR;
                            }
                        }
                    } else {
                        return mix.SEEN;
                    }
                }
                return mix.SENDING;
            }
            return mix.DELIVERED;
        }
        return mix.SENT;
    }

    public static miy ay(int i) {
        if (i != 3) {
            return miy.a;
        }
        return miy.b;
    }

    public static nbv az(ncg ncgVar, Resources resources, MessagesTable.BindData bindData, alog alogVar, ifs ifsVar, mzx mzxVar, mll mllVar) {
        String string;
        nbv b = ncgVar.b(resources, bindData, alogVar, ifsVar, mzxVar, mllVar);
        String M = bindData.M();
        if (!TextUtils.isEmpty(M)) {
            String str = b.a;
            if (str == null) {
                string = null;
            } else {
                string = resources.getString(R.string.message_status_error, str, M);
            }
            return new nbv(string, b.h, b.b, b.c, b.d, false, false, false, 224);
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ChipData b(mkh mkhVar, msh mshVar) {
        alog alogVar = mkhVar.e;
        alogVar.getClass();
        if (!alogVar.isEmpty()) {
            alur it = alogVar.iterator();
            while (it.hasNext()) {
                if (((agoe) it.next()).b.equals(mshVar)) {
                    return new ChipData(new ChipId.Identity(mshVar), mkhVar.d, mkhVar.b, mkhVar.f, false, 16, null);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static Float bA(byn bynVar) {
        return (Float) bynVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void bB(kbi kbiVar, Long l, aeiz aeizVar, cmb cmbVar, boolean z, boolean z2, bwj bwjVar, int i) {
        int i2;
        aekt aektVar;
        aekt aektVar2;
        boolean booleanValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        bwj c2 = bwjVar.c(1046802024);
        if ((i & 14) == 0) {
            if (true != c2.G(kbiVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(l)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c2.G(aeizVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c2.G(cmbVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (true != c2.H(z)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (true != c2.H(z2)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && c2.L()) {
            c2.v();
        } else {
            kbn kbnVar = kbiVar.n;
            cas b = cao.b(kbnVar.h, false, null, c2, 2);
            c2.y(1052161823);
            boolean G = c2.G(kbnVar);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new byu(null, cav.a);
                bwkVar.ad(T);
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            c2.y(1052164096);
            boolean G2 = c2.G(kbnVar);
            Object T2 = bwkVar.T();
            if (G2 || T2 == bwj.a.a) {
                T2 = new byu(false, cav.a);
                bwkVar.ad(T2);
            }
            byn bynVar2 = (byn) T2;
            bwkVar.Y();
            c2.y(1052166418);
            boolean G3 = c2.G(kbnVar);
            Object T3 = bwkVar.T();
            if (G3 || T3 == bwj.a.a) {
                T3 = new jze(kbnVar, b, bynVar2, bynVar, 2);
                bwkVar.ad(T3);
            }
            arqr arqrVar = (arqr) T3;
            bwkVar.Y();
            c2.y(1052173555);
            boolean G4 = c2.G(kbnVar);
            Object T4 = bwkVar.T();
            if (G4 || T4 == bwj.a.a) {
                T4 = new jfq(kbnVar, bynVar, bynVar2, 9);
                bwkVar.ad(T4);
            }
            arqg arqgVar = (arqg) T4;
            bwkVar.Y();
            c2.y(1052181869);
            boolean G5 = c2.G(kbnVar);
            Object T5 = bwkVar.T();
            if (!G5 && T5 != bwj.a.a) {
                aektVar = null;
            } else {
                aektVar = null;
                T5 = new jkq(kbnVar, b, 19, null);
                bwkVar.ad(T5);
            }
            arqg arqgVar2 = (arqg) T5;
            bwkVar.Y();
            aeiy aeiyVar = new aeiy(cn(bA(bynVar), l, kbnVar.i), arqrVar, arqgVar);
            List list = kbiVar.k;
            if (list != null && !list.isEmpty()) {
                aektVar2 = new aekt(list, new aeko(aeiyVar.a, aeiyVar.b, aeiyVar.c));
            } else {
                aektVar2 = aektVar;
            }
            booleanValue = ((Boolean) b.a()).booleanValue();
            aetn.aA(new aeki(new aeiv(kbiVar.b, aeizVar, kbiVar.j, z, z2, kbiVar.c, booleanValue, co(bA(bynVar), l, kbnVar.i), arqgVar2, aeiyVar, null, aektVar2, new aeiu(), 1024), new aekh((byte[]) aektVar), kbiVar.b, kbiVar.c, (arqg) null, 48), null, cmbVar, c2, (i2 >> 3) & 896, 2);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kbg(kbiVar, l, aeizVar, cmbVar, z, z2, i, 0);
        }
    }

    public static void bC(byn bynVar, Float f) {
        bynVar.h(f);
    }

    public static void bD(kbi kbiVar, cmb cmbVar, boolean z, bwj bwjVar, int i) {
        int i2;
        afbd afbdVar;
        boolean booleanValue;
        int i3;
        cas casVar;
        bwk bwkVar;
        aekt aektVar;
        boolean booleanValue2;
        boolean booleanValue3;
        bwj c2 = bwjVar.c(-1444251918);
        if ((i & 14) == 0) {
            i2 = (true != c2.G(kbiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= true != c2.G(cmbVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i2 |= true != c2.H(z) ? 128 : 256;
        }
        if ((i2 & 731) == 146 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            }
            c2.n();
            c2.y(298773012);
            int i4 = i2 & 14;
            bwk bwkVar2 = (bwk) c2;
            Object T = bwkVar2.T();
            if (i4 == 4 || T == bwj.a.a) {
                T = new jsu(kbiVar, (arpe) null, 10);
                bwkVar2.ad(T);
            }
            bwkVar2.Y();
            bxl.g(kbiVar, (arqv) T, c2);
            cas b = cao.b(kbiVar.n.f, false, null, c2, 2);
            cas b2 = cao.b(kbiVar.n.g, false, null, c2, 2);
            c2.y(298780593);
            Object T2 = bwkVar2.T();
            if (T2 == bwj.a.a) {
                T2 = new fzj((arpe) null, 4, (int[]) null);
                bwkVar2.ad(T2);
            }
            bwkVar2.Y();
            cas a = cam.a(false, (arqv) T2, c2);
            kbn kbnVar = kbiVar.n;
            c2.y(298782371);
            Object T3 = bwkVar2.T();
            if (i4 == 4 || T3 == bwj.a.a) {
                T3 = new jsv(kbiVar, 18);
                bwkVar2.ad(T3);
            }
            bwkVar2.Y();
            bxl.c(kbnVar, (arqr) T3, c2);
            kbo kboVar = kbiVar.h;
            c2.y(298784707);
            Object T4 = bwkVar2.T();
            if (i4 == 4 || T4 == bwj.a.a) {
                T4 = new jsv(kbiVar, 19);
                bwkVar2.ad(T4);
            }
            bwkVar2.Y();
            bxl.c(kboVar, (arqr) T4, c2);
            kbo kboVar2 = kbiVar.h;
            qdq qdqVar = kboVar2 != null ? kboVar2.e : null;
            c2.y(298791233);
            if (kboVar2 == null) {
                afbdVar = null;
            } else {
                c2.y(298792591);
                afbdVar = kboVar2.a;
                if (afbdVar instanceof afbb) {
                    c2.y(-511947271);
                    booleanValue = ((Boolean) a.a()).booleanValue();
                    afbdVar = new afbb(booleanValue, ((Number) cao.b(kboVar2.c, Float.valueOf(brg.a), null, c2, 2).a()).floatValue(), ((afbb) afbdVar).c);
                    bwkVar2.Y();
                } else if (!(afbdVar instanceof afba)) {
                    c2.y(-511937019);
                    bwkVar2.Y();
                } else {
                    c2.y(1309707424);
                    ((Boolean) cak.a(kboVar2.b, c2).a()).booleanValue();
                    throw null;
                }
                bwkVar2.Y();
            }
            bwkVar2.Y();
            aeiz aeizVar = afbdVar != null ? new aeiz(afbdVar, qdqVar) : null;
            cas b3 = cao.b(kbiVar.n.j, null, null, c2, 2);
            cas b4 = cao.b(kbiVar.n.k, null, null, c2, 2);
            List list = kbiVar.k;
            if (list == null) {
                i3 = i4;
                casVar = b3;
                bwkVar = bwkVar2;
                aektVar = null;
            } else if (list.isEmpty()) {
                i3 = i4;
                casVar = b3;
                aektVar = null;
                bwkVar = bwkVar2;
            } else {
                bwkVar = bwkVar2;
                i3 = i4;
                casVar = b3;
                aektVar = new aekt(list, new aeko(cn(cp(b4), cq(b3), kbiVar.n.i), 6));
            }
            booleanValue2 = ((Boolean) b2.a()).booleanValue();
            if (!booleanValue2) {
                bwk bwkVar3 = bwkVar;
                booleanValue3 = ((Boolean) b.a()).booleanValue();
                if (booleanValue3) {
                    c2.y(298861231);
                    aetn.aA(new aeki(new aeix(kbiVar.b, aeizVar, kbiVar.j, kbiVar.d, z, kbiVar.c, co(cp(b4), cq(casVar), kbiVar.n.i), aektVar, new aeiu()), new aekh((byte[]) null), kbiVar.b, kbiVar.c, (arqg) null, 48), null, cmbVar, c2, (i2 << 3) & 896, 2);
                    bwkVar3.Y();
                } else if (kbiVar.e) {
                    c2.y(298902423);
                    aetn.aA(new aeki(new aeiw(kbiVar.b, aeizVar, kbiVar.j, kbiVar.d, z, kbiVar.c, new aeiu()), new aekh((byte[]) null), kbiVar.b, kbiVar.c, (arqg) null, 48), null, cmbVar, c2, (i2 << 3) & 896, 2);
                    bwkVar3.Y();
                } else {
                    c2.y(298933690);
                    bB(kbiVar, cq(casVar), aeizVar, cmbVar, kbiVar.d, z, c2, i3 | 512 | ((i2 << 6) & 7168) | ((i2 << 9) & 458752));
                    bwkVar3.Y();
                }
            } else {
                c2.y(298831735);
                aetn.aA(new aeki(new aeit(kbiVar.b, aeizVar, kbiVar.d, z, kbiVar.c, new aeiu(), 68), new aekh((byte[]) null), kbiVar.b, kbiVar.c, (arqg) null, 48), null, cmbVar, c2, (i2 << 3) & 896, 2);
                bwkVar.Y();
            }
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jyn(kbiVar, cmbVar, z, i, 2);
        }
    }

    public static aekf bE(String str) {
        str.getClass();
        if (gh.q(str)) {
            return aekf.a;
        }
        if (gh.f(str)) {
            return aekf.b;
        }
        return aekf.c;
    }

    public static String bF(ResolvedRecipient resolvedRecipient) {
        String m;
        msh f = resolvedRecipient.f();
        String str = null;
        if (f != null && (m = f.m()) != null) {
            int length = m.length();
            str = m.substring(length - arrn.s(4, length));
            str.getClass();
        }
        if (str == null) {
            return resolvedRecipient.r(true);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bG(defpackage.aetv r21, defpackage.awg r22, defpackage.apdv r23, java.lang.Object r24, defpackage.bwj r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lga.bG(aetv, awg, apdv, java.lang.Object, bwj, int, int):void");
    }

    public static void bH(aeze aezeVar, awg awgVar, bwj bwjVar, int i) {
        bwj c2 = bwjVar.c(36185465);
        if (aezeVar instanceof aesf) {
            c2.y(1741915101);
            aeke.aF((aesf) aezeVar, null, awa.c(awgVar, new awd(brg.a), new awd(brg.a), null, null, 12), c2, 0);
            ((bwk) c2).Y();
        } else if (aezeVar instanceof kef) {
            c2.y(1741920187);
            kee.a((kef) aezeVar, null, c2, 0);
            ((bwk) c2).Y();
        } else {
            c2.y(-1835005339);
            ((bwk) c2).Y();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new iea(aezeVar, awgVar, i, 14);
        }
    }

    public static long bI(miz mizVar) {
        mizVar.getClass();
        return mizVar.h().toEpochMilli();
    }

    public static boolean bJ(miz mizVar) {
        if (bV(mizVar)) {
            nbv q = mizVar.q();
            if (true != (q instanceof nbv)) {
                q = null;
            }
            if (q != null && q.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean bK(miz mizVar) {
        if (bV(mizVar)) {
            nbv q = mizVar.q();
            if (true != (q instanceof nbv)) {
                q = null;
            }
            if (q != null && q.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean bL(miz mizVar) {
        if (bV(mizVar)) {
            nbv q = mizVar.q();
            if (true != (q instanceof nbv)) {
                q = null;
            }
            if (q != null && q.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean bM(miz mizVar) {
        if (bV(mizVar)) {
            nbv q = mizVar.q();
            if (true != (q instanceof nbv)) {
                q = null;
            }
            if (q != null && q.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean bN(miz mizVar) {
        nbv q = mizVar.q();
        if (true != (q instanceof nbv)) {
            q = null;
        }
        if (q != null && q.g) {
            return true;
        }
        return false;
    }

    public static boolean bO(miz mizVar) {
        if (!bJ(mizVar) && !bK(mizVar) && !bL(mizVar) && !bN(mizVar)) {
            return false;
        }
        return true;
    }

    public static boolean bP(miz mizVar) {
        nbv q = mizVar.q();
        if (q != null && q.h == 2) {
            return true;
        }
        return false;
    }

    public static boolean bQ(miz mizVar) {
        muk mukVar;
        hgi D;
        mje c2 = mizVar.c();
        if (c2 instanceof muk) {
            mukVar = (muk) c2;
        } else {
            mukVar = null;
        }
        if (mukVar != null && (D = mukVar.a.D()) != null) {
            return D.y();
        }
        return false;
    }

    public static boolean bR(miz mizVar) {
        muk mukVar;
        hgi D;
        mje c2 = mizVar.c();
        Boolean bool = null;
        if (c2 instanceof muk) {
            mukVar = (muk) c2;
        } else {
            mukVar = null;
        }
        if (mukVar != null && (D = mukVar.a.D()) != null) {
            tqr A = ((ParticipantsTable.BindData) D.a).A();
            if (A != null) {
                int ordinal = A.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        bool = false;
                    }
                } else {
                    bool = true;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public static boolean bS(miz mizVar) {
        muk mukVar;
        mje c2 = mizVar.c();
        if (c2 instanceof muk) {
            mukVar = (muk) c2;
        } else {
            mukVar = null;
        }
        if (mukVar != null) {
            return mukVar.a.u();
        }
        return false;
    }

    public static boolean bT(miz mizVar) {
        if (bV(mizVar) && !(mizVar instanceof mty)) {
            mje c2 = mizVar.c();
            c2.getClass();
            if (((mjm) c2).a() == mix.DELIVERED) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean bU(miz mizVar) {
        if (mizVar.c().d() == 1) {
            return true;
        }
        return false;
    }

    public static boolean bV(miz mizVar) {
        mizVar.getClass();
        if (mizVar.c().d() == 2) {
            return true;
        }
        return false;
    }

    public static boolean bW(miz mizVar) {
        if (mizVar.a() == miy.b) {
            return true;
        }
        return false;
    }

    public static boolean bX(miz mizVar) {
        if (mizVar.a() == miy.b) {
            return true;
        }
        return false;
    }

    public static boolean bY(miz mizVar) {
        if (bV(mizVar) && !(mizVar instanceof mty)) {
            mje c2 = mizVar.c();
            c2.getClass();
            if (((mjm) c2).a() == mix.SENDING) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean bZ(miz mizVar) {
        nbv q = mizVar.q();
        if (true != (q instanceof nbv)) {
            q = null;
        }
        if (q != null && q.e) {
            return true;
        }
        return false;
    }

    public static void ba(kio kioVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-463316012);
        if (i5 == 0) {
            if (true != c2.G(kioVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
            bzz e = c2.e();
            if (e != null) {
                ((bzf) e).d = new kie(kioVar, cgaVar, i, 5);
                return;
            }
            return;
        }
        throw null;
    }

    public static void bb(kin kinVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        bwj c2 = bwjVar.c(-1960437657);
        if ((i & 14) == 0) {
            if (true != c2.G(kinVar)) {
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
            boolean z = false;
            cas b = cao.b(kinVar.b, 0, null, c2, 2);
            amj h = amh.h(brg.a, 26.0f, brg.a, 24.0f, 5);
            c2.y(-1907847811);
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean G = c2.G(b) | z;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new kjs(kinVar, b, 1, null);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            anp.a(null, null, h, false, null, null, null, false, (arqr) T, c2, 384, 251);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kinVar, i, 18);
        }
    }

    public static void bc(kil kilVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(2126218824);
        if (i5 == 0) {
            if (true != c2.G(kilVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            aeke.Z(new aemb(dga.a(R.string.premium_sms_options_title, c2), new aewr(dga.a(R.string.premium_sms_options_open_settings_button, c2), kilVar.d), new aewr(dga.a(R.string.premium_sms_options_resend_button, c2), kilVar.e), kilVar.b, kilVar.c, (aews) null, aelt.b, kilVar.a, 736), cgaVar, c2, i2 & 112, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(kilVar, cgaVar, i, 4);
        }
    }

    public static void bd(kik kikVar, bwj bwjVar, int i) {
        int i2;
        bwk bwkVar;
        int i3;
        arqg arqgVar;
        int i4;
        arqg arqgVar2;
        arqg arqgVar3;
        aetf aetfVar;
        String a;
        aerb aerbVar;
        int i5;
        int i6 = i & 14;
        bwj c2 = bwjVar.c(1384654243);
        if (i6 == 0) {
            if (true != c2.G(kikVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            cga f = amh.f(cga.e, 8.0f, 24.0f, 8.0f, 16.0f);
            ajw.e eVar = ajw.c;
            int i7 = cfq.a;
            cue a2 = akk.a(eVar, cfq.a.m, c2, 0);
            int a3 = bwg.a(c2);
            bwk bwkVar2 = (bwk) c2;
            byx P = bwkVar2.P();
            cga b = cfv.b(c2, f);
            int i8 = cwl.a;
            arqg arqgVar4 = cwl.a.a;
            c2.A();
            if (bwkVar2.y) {
                c2.l(arqgVar4);
            } else {
                c2.C();
            }
            caw.b(c2, a2, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar2.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            arqg arqgVar5 = kikVar.a;
            c2.y(44613329);
            if (arqgVar5 != null) {
                bwkVar = bwkVar2;
                aetn.k(new aeth(dga.a(R.string.message_actions_turn_on_data_setting, c2), null, null, null, new aete(aerb.cP), arqgVar5, 94), null, null, null, null, null, c2, 0, 0, 2046);
            } else {
                bwkVar = bwkVar2;
            }
            bwkVar.Y();
            c2.y(44624949);
            if (kikVar.k && (arqgVar2 = kikVar.b) != null) {
                boolean z = kikVar.g;
                if (!z && !kikVar.h) {
                    arqgVar3 = arqgVar2;
                } else {
                    arqgVar3 = null;
                }
                if (!z && !kikVar.h) {
                    if (kikVar.f) {
                        aerbVar = aerb.cK;
                    } else {
                        aerbVar = aerb.cJ;
                    }
                    aetfVar = new aete(aerbVar);
                } else {
                    aetfVar = aetd.a;
                }
                if (kikVar.e) {
                    c2.y(647886695);
                    if (kikVar.g) {
                        c2.y(647905574);
                        a = dga.a(R.string.message_actions_still_sending_as_rcs, c2);
                        bwkVar.Y();
                    } else if (kikVar.h) {
                        c2.y(648042501);
                        String str = kikVar.i;
                        if (str != null) {
                            c2.y(648161913);
                            a = dga.b(R.string.message_actions_delivers_when_recipient_online, new Object[]{str}, c2);
                            bwkVar.Y();
                        } else {
                            c2.y(648375348);
                            a = dga.a(R.string.message_actions_delivers_when_any_recipient_online, c2);
                            bwkVar.Y();
                        }
                        bwkVar.Y();
                    } else {
                        c2.y(648520397);
                        a = dga.a(R.string.message_actions_resend_as_rcs, c2);
                        bwkVar.Y();
                    }
                    bwkVar.Y();
                } else {
                    c2.y(648644180);
                    if (kikVar.g) {
                        c2.y(648679117);
                        a = dga.a(R.string.message_actions_still_sending, c2);
                        bwkVar.Y();
                    } else {
                        c2.y(648780084);
                        a = dga.a(R.string.message_actions_resend, c2);
                        bwkVar.Y();
                    }
                    bwkVar.Y();
                }
                aetn.k(new aeth(a, null, null, null, aetfVar, arqgVar3, 94), null, null, null, null, null, c2, 0, 0, 2046);
            }
            bwkVar.Y();
            arqg arqgVar6 = kikVar.c;
            c2.y(44679010);
            if (arqgVar6 != null) {
                if (true != kikVar.j) {
                    arqgVar = null;
                } else {
                    arqgVar = arqgVar6;
                }
                aete aeteVar = new aete(aerb.cJ, "SMS");
                if (true != kikVar.j) {
                    i4 = R.string.message_actions_resend_as_fallback_no_connection;
                } else {
                    i4 = R.string.message_actions_resend_as_fallback;
                }
                aetn.k(new aeth(dga.a(i4, c2), null, null, null, aeteVar, arqgVar, 94), null, null, null, null, null, c2, 0, 0, 2046);
            }
            bwkVar.Y();
            arqg arqgVar7 = kikVar.d;
            c2.y(44697309);
            if (arqgVar7 != null) {
                aete aeteVar2 = new aete(aerb.aw);
                if (true != kikVar.g) {
                    i3 = R.string.message_actions_delete;
                } else {
                    i3 = R.string.message_actions_stop_sending_and_delete;
                }
                aetn.k(new aeth(dga.a(i3, c2), null, null, null, aeteVar2, arqgVar7, 94), null, null, null, null, null, c2, 0, 0, 2046);
            }
            bwkVar.Y();
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kikVar, i, 17);
        }
    }

    public static void be(kij kijVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(1123288866);
        if (i5 == 0) {
            if (true != c2.G(kijVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            aeke.Z(new aemb("Conversation 2.0 Dogfood", new aewr("Opt out", kijVar.c), new aewr("Send feedback", kijVar.b), "This is a full rewrite of the conversation screen designed to be faster and easier to build features on. There will be some rough edges and it is not at feature parity with the old screen yet. Please feel free to send feedback or opt-out if needed, opt outs may be reset after a period of time.\n\nFor additional help, reach out to messages-discuss@.", (List) null, (aews) null, aelt.b, kijVar.a, 752), cgaVar, c2, i2 & 112, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(kijVar, cgaVar, i, 3);
        }
    }

    public static void bf(jxh jxhVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        jxhVar.getClass();
        int i5 = i & 14;
        bwj c2 = bwjVar.c(418075945);
        boolean z2 = true;
        if (i5 == 0) {
            if (true != c2.G(jxhVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqgVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            String str = jxhVar.a;
            c2.y(1685170878);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if ((z2 | z) || T == bwj.a.a) {
                T = new kfq(arqgVar, jxhVar, 5, null);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            aetn.k(new aeth(str, null, null, null, null, (arqg) T, 126), null, null, null, null, null, c2, 0, 0, 2046);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(jxhVar, arqgVar, i, 2, null);
        }
    }

    public static void bg(kih kihVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(87463934);
        if (i4 == 0) {
            if (true != c2.G(kihVar)) {
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
            amj h = amh.h(brg.a, 8.0f, brg.a, 8.0f, 5);
            c2.y(319616371);
            int i5 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new kbt(kihVar, 18);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            anp.a(null, null, h, false, null, null, null, false, (arqr) T, c2, 384, 251);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kihVar, i, 16);
        }
    }

    public static void bh(kif kifVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1212826495);
        if (i4 == 0) {
            if (true != c2.G(kifVar)) {
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
            amj h = amh.h(brg.a, 30.0f, brg.a, 20.0f, 5);
            c2.y(-412472172);
            int i5 = i2 & 14;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new kbt(kifVar, 16);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            anp.a(null, null, h, false, null, null, null, false, (arqr) T, c2, 384, 251);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kifVar, i, 15);
        }
    }

    public static void bi(aemc aemcVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(-436027790);
        if (i5 == 0) {
            if (true != c2.G(aemcVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            aeke.ac(cgaVar, null, 0L, 0L, aemcVar, cdk.e(214191, new jjs(aemcVar, 10), c2), c2, ((i2 >> 3) & 14) | 196608 | ((i2 << 12) & 57344), 14);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(aemcVar, cgaVar, i, 0);
        }
    }

    public static void bj(aemc aemcVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(526519009);
        if (i4 == 0) {
            if (true != c2.G(aemcVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 91) == 18 && c2.L()) {
            c2.v();
        } else {
            boolean z = aemcVar instanceof kij;
            cga.a aVar = cga.e;
            if (z) {
                c2.y(-1425425789);
                be((kij) aemcVar, aVar, c2, i5 & 112);
                ((bwk) c2).Y();
            } else if (aemcVar instanceof kit) {
                c2.y(-1425423223);
                aX((kit) aemcVar, aVar, c2, i5 & 112);
                ((bwk) c2).Y();
            } else if (aemcVar instanceof kiu) {
                c2.y(-1425420471);
                aW((kiu) aemcVar, aVar, c2, i5 & 112);
                ((bwk) c2).Y();
            } else if (aemcVar instanceof kil) {
                c2.y(-1425417950);
                bc((kil) aemcVar, aVar, c2, i5 & 112);
                ((bwk) c2).Y();
            } else if (aemcVar instanceof jxf) {
                c2.y(-1425415755);
                hwr.W((jxf) aemcVar, c2, 0);
                ((bwk) c2).Y();
            } else if (!(aemcVar instanceof aemb) && !(aemcVar instanceof aema)) {
                if (!(aemcVar instanceof lql)) {
                    int i6 = i5 & 112;
                    if (aemcVar instanceof kio) {
                        c2.y(-1425406748);
                        ba((kio) aemcVar, aVar, c2, i6);
                        ((bwk) c2).Y();
                    } else {
                        c2.y(-1425405086);
                        bi(aemcVar, aVar, c2, i5 & 126);
                        ((bwk) c2).Y();
                    }
                } else {
                    c2.y(-1425410451);
                    throw null;
                }
            } else {
                c2.y(-1425412710);
                aeke.Z(aemcVar, aVar, c2, i5 & 126, 0);
                ((bwk) c2).Y();
            }
            cgaVar = aVar;
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kie(aemcVar, cgaVar, i, 1);
        }
    }

    public static khe bk(List list) {
        if (list.size() == 1) {
            return khe.b;
        }
        if (list.isEmpty()) {
            return khe.a;
        }
        return khe.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int bl(String str) {
        char c2;
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            switch (upperCase.hashCode()) {
                case -1665858682:
                    if (upperCase.equals("SCREEN_EFFECTS_SAD")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -566859894:
                    if (upperCase.equals("SCREEN_EFFECTS_OLYMPICS")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -329346054:
                    if (upperCase.equals("SCREEN_EFFECTS_UNKNOWN")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -102398549:
                    if (upperCase.equals("SCREEN_EFFECTS_FALL")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -102206046:
                    if (upperCase.equals("SCREEN_EFFECTS_LOVE")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -83996996:
                    if (upperCase.equals("SCREEN_EFFECTS_FIREWORKS")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 378663367:
                    if (upperCase.equals("SCREEN_EFFECTS_THANKSGIVING")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 765452349:
                    if (upperCase.equals("SCREEN_EFFECTS_SPRING")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 769924575:
                    if (upperCase.equals("SCREEN_EFFECTS_SUMMER")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 873395445:
                    if (upperCase.equals("SCREEN_EFFECTS_WINTER")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1116377015:
                    if (upperCase.equals("SCREEN_EFFECTS_ANGER")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1126161969:
                    if (upperCase.equals("SCREEN_EFFECTS_LAUGH")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1301766167:
                    if (upperCase.equals("SCREEN_EFFECTS_GOODMORNING")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1309439257:
                    if (upperCase.equals("SCREEN_EFFECTS_SURPRISE")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1570801963:
                    if (upperCase.equals("SCREEN_EFFECTS_GOODNIGHT")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1612716919:
                    if (upperCase.equals("SCREEN_EFFECTS_CELEBRATE")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case '\b':
                    return 10;
                case '\t':
                    return 11;
                case '\n':
                    return 12;
                case 11:
                    return 13;
                case '\f':
                    return 16;
                case '\r':
                    return 18;
                case 14:
                    return 21;
                case 15:
                    return 22;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (Exception unused) {
            return 1;
        }
    }

    public static void bm(kgl kglVar, bwj bwjVar, int i) {
        kglVar.getClass();
        bwj c2 = bwjVar.c(1985973183);
        wf.a(kglVar.b, null, wx.m().a(wx.g(null, 3)), wx.n().a(wx.h(null, 3)), null, cdk.e(-2050144617, new jjs(kglVar, 9), c2), c2, 200064, 18);
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kglVar, i, 12);
        }
    }

    public static long bn(nae naeVar) {
        return naeVar.a.size() + naeVar.b + naeVar.c;
    }

    public static void bo(kfc kfcVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1737424071);
        if (i4 == 0) {
            if (true != c2.G(kfcVar)) {
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
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c2, 0);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, aVar);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            adcx.bu(kfcVar.b, null, false, c2, 0, 6);
            c2.y(-265631542);
            cga cgaVar = cga.e;
            if (adom.cd(c2)) {
                cgaVar = amh.j(cga.e, brg.a, brg.a, brg.a, 4.0f, 7);
            }
            afaj afajVar = kfcVar.a;
            if (afajVar instanceof afai) {
                cgaVar = cgaVar.a(dea.a(cga.e, ((afai) afajVar).a.a));
            }
            afaj afajVar2 = kfcVar.a;
            if (afajVar2 instanceof afah) {
                cga.a aVar2 = cga.e;
                List list = ((afah) afajVar2).a;
                c2.y(-1016192150);
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = jyp.e;
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                cgaVar = cgaVar.a(dea.a(aVar2, aqjn.aK(list, "\n", null, null, (arqr) T, 30)));
            }
            bwkVar.Y();
            adom.bV(kfcVar.a, cgaVar, !adom.cd(c2), c2, 0);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kfcVar, i, 11);
        }
    }

    public static aeuh bp(kam kamVar, int i, int i2) {
        aeuh a = kamVar.a();
        if (i2 == 1) {
            return a;
        }
        if (i == 0) {
            aeuh aeuhVar = aeuh.c;
            if (a != aeuhVar && a != aeuh.d) {
                return aeuh.b;
            }
            return aeuhVar;
        }
        if (i < i2 - 1) {
            return aeuh.c;
        }
        aeuh aeuhVar2 = aeuh.c;
        if (a != aeuhVar2 && a != aeuh.b) {
            return aeuh.d;
        }
        return aeuhVar2;
    }

    public static void bq(kex kexVar, aeux aeuxVar, zj zjVar, bwj bwjVar, int i) {
        int i2;
        cga c2;
        int i3;
        int i4;
        int i5;
        aeuxVar.getClass();
        zjVar.getClass();
        int i6 = i & 14;
        bwj c3 = bwjVar.c(515276663);
        if (i6 == 0) {
            if (true != c3.G(kexVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c3.G(aeuxVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c3.G(zjVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !c3.L()) {
            c2 = amv.c(cga.e, 1.0f);
            ajw.e eVar = ajw.c;
            int i7 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c3, 0);
            int a2 = bwg.a(c3);
            bwk bwkVar = (bwk) c3;
            byx P = bwkVar.P();
            cga b = cfv.b(c3, c2);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar);
            } else {
                c3.C();
            }
            caw.b(c3, a, cwl.a.e);
            caw.b(c3, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c3.j(valueOf, arqvVar);
            }
            caw.b(c3, b, cwl.a.c);
            c3.y(-464476574);
            for (jzx jzxVar : kexVar.a) {
                adcx.cf(jzxVar.a, null, zjVar, aeuxVar, cdk.e(218482642, new jjs(jzxVar, 8), c3), c3, (i2 & 896) | 25088 | ((i2 << 6) & 7168), 2);
            }
            bwkVar.Y();
            c3.p();
        } else {
            c3.v();
        }
        bzz e = c3.e();
        if (e != null) {
            ((bzf) e).d = new jkb((Object) kexVar, (Object) aeuxVar, (Object) zjVar, i, 7, (short[]) null);
        }
    }

    public static void br(kew kewVar, bwj bwjVar, int i) {
        int i2 = i & 1;
        bwj c2 = bwjVar.c(1604746169);
        if (i2 == 0 && c2.L()) {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kewVar, i, 10);
        }
    }

    public static void bs(kes kesVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(1615947374);
        if (i4 == 0) {
            if (true != c2.G(kesVar)) {
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
            aeke.W(kesVar.a, null, c2, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new jgb(kesVar, i, 9);
        }
    }

    public static String bt(myr myrVar) {
        if (myrVar instanceof mys) {
            return ((mys) myrVar).c();
        }
        return null;
    }

    public static boolean bu(myr myrVar) {
        if (myrVar instanceof mys) {
            return ((mys) myrVar).d();
        }
        return false;
    }

    public static aewk bv(kdc kdcVar, Float f) {
        return new aewj(f, kdcVar.d, kdcVar.a, aewh.e, aewh.f, kdcVar.b);
    }

    public static boolean bw(String str, dja djaVar, dje djeVar, int i) {
        if (dja.a(djaVar, str, djeVar, 3, 1, dqt.l(i, 0, 13), 968).s()) {
            return false;
        }
        return true;
    }

    public static boolean bx(miz mizVar) {
        mjl mjlVar;
        mix a;
        Set r = aqil.r(new mix[]{mix.SENT, mix.DELIVERED, mix.SEEN});
        mje c2 = mizVar.c();
        if (c2 instanceof mjl) {
            mjlVar = (mjl) c2;
        } else {
            mjlVar = null;
        }
        if (mjlVar == null || (a = mjlVar.a()) == null) {
            return true;
        }
        return r.contains(a);
    }

    public static boolean by(mym mymVar) {
        if ((mymVar instanceof myn) && ((myn) mymVar).m() != 1) {
            return true;
        }
        return false;
    }

    public static boolean bz(mym mymVar) {
        if ((mymVar instanceof myn) && !d.F(((myn) mymVar).d(), Uri.EMPTY) && !gh.i(mymVar.j())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.bwj r2, int r3) {
        /*
            r0 = 1332360788(0x4f6a3654, float:3.929429E9)
            bwj r2 = r2.c(r0)
            r0 = 0
            if (r3 != 0) goto L17
            boolean r3 = r2.L()
            if (r3 != 0) goto L12
            r3 = r0
            goto L17
        L12:
            r2.v()
            r3 = r0
            goto L1a
        L17:
            defpackage.aetn.J(r2, r0)
        L1a:
            bzz r2 = r2.e()
            if (r2 == 0) goto L29
            lhs r1 = new lhs
            r1.<init>(r3, r0)
            bzf r2 = (defpackage.bzf) r2
            r2.d = r1
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lga.c(bwj, int):void");
    }

    public static boolean ca(miz mizVar) {
        mizVar.getClass();
        if (bV(mizVar) && !(mizVar instanceof mty)) {
            mje c2 = mizVar.c();
            c2.getClass();
            if (((mjm) c2).a() == mix.SENT) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean cb(miz mizVar) {
        if (mizVar.a() == miy.a) {
            return true;
        }
        return false;
    }

    public static boolean cc(miz mizVar) {
        muk mukVar;
        hgi E;
        mje c2 = mizVar.c();
        if (c2 instanceof muk) {
            mukVar = (muk) c2;
        } else {
            mukVar = null;
        }
        if (mukVar != null && (E = mukVar.a.E()) != null) {
            return E.A();
        }
        return false;
    }

    public static boolean cd(miz mizVar) {
        muk mukVar;
        hgi E;
        mje c2 = mizVar.c();
        if (c2 instanceof muk) {
            mukVar = (muk) c2;
        } else {
            mukVar = null;
        }
        if (mukVar == null || (E = mukVar.a.E()) == null || E.A() || !yyb.G(((ParticipantsTable.BindData) E.a).m()).c()) {
            return false;
        }
        return true;
    }

    public static int ce(miz mizVar) {
        if (bV(mizVar)) {
            return 2;
        }
        return 1;
    }

    public static qkg cf(jzy jzyVar, kaa kaaVar) {
        return new qjp(new jkq(jzyVar, kaaVar, 10));
    }

    public static boolean cg(miz mizVar) {
        nbe f = mizVar.f();
        if (f != null && f.a().size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean ch(miz mizVar, miz mizVar2) {
        mje c2 = mizVar.c();
        boolean z = c2 instanceof muk;
        mje c3 = mizVar2.c();
        if (z && (c3 instanceof muk) && ((muk) c2).a.equals(((muk) c3).a)) {
            return true;
        }
        if (!(c2 instanceof mjl) || !(c3 instanceof mjl)) {
            return false;
        }
        if (((mjl) c2).c().equals(((mjl) c3).c())) {
            return true;
        }
        return false;
    }

    public static boolean ci(miz mizVar, miz mizVar2) {
        if (mizVar2 == null || !ch(mizVar, mizVar2) || Math.abs(mizVar.h().toEpochMilli() - mizVar2.h().toEpochMilli()) >= 60000) {
            return false;
        }
        return true;
    }

    private static ljq cj(cas casVar) {
        return (ljq) casVar.a();
    }

    private static lfp ck(cas casVar) {
        return (lfp) casVar.a();
    }

    private static int cl(boolean z) {
        if (z) {
            return 1;
        }
        return 0;
    }

    private static afaw cm(cas casVar) {
        return (afaw) casVar.a();
    }

    private static float cn(Float f, Long l, long j) {
        if (f != null) {
            return f.floatValue();
        }
        if (j <= 0 || l == null) {
            return brg.a;
        }
        return ((float) l.longValue()) / ((float) j);
    }

    private static long co(Float f, Long l, long j) {
        if (f != null) {
            return f.floatValue() * ((float) j);
        }
        if (l == null) {
            return j;
        }
        return l.longValue();
    }

    private static Float cp(cas casVar) {
        return (Float) casVar.a();
    }

    private static Long cq(cas casVar) {
        return (Long) casVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (defpackage.d.F(((defpackage.lht) r8).a, r7.c) == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(defpackage.lhr r7, defpackage.lhv r8, defpackage.bwj r9, int r10) {
        /*
            r0 = r10 & 14
            r1 = 632241481(0x25af3d49, float:3.039919E-16)
            bwj r9 = r9.c(r1)
            r1 = 1
            if (r0 != 0) goto L17
            boolean r0 = r9.G(r7)
            if (r1 == r0) goto L14
            r0 = 2
            goto L15
        L14:
            r0 = 4
        L15:
            r0 = r0 | r10
            goto L18
        L17:
            r0 = r10
        L18:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L28
            boolean r2 = r9.G(r8)
            if (r1 == r2) goto L25
            r1 = 16
            goto L27
        L25:
            r1 = 32
        L27:
            r0 = r0 | r1
        L28:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L39
            boolean r1 = r9.L()
            if (r1 != 0) goto L35
            goto L39
        L35:
            r9.v()
            goto L8e
        L39:
            lhu r1 = defpackage.lhu.b
            boolean r1 = defpackage.d.F(r8, r1)
            if (r1 == 0) goto L42
            goto L5c
        L42:
            lhu r1 = defpackage.lhu.a
            boolean r1 = defpackage.d.F(r8, r1)
            if (r1 == 0) goto L4b
            goto L6e
        L4b:
            boolean r1 = r8 instanceof defpackage.lht
            if (r1 == 0) goto La5
            r1 = r8
            lht r1 = (defpackage.lht) r1
            java.lang.String r1 = r1.a
            java.lang.String r2 = r7.c
            boolean r1 = defpackage.d.F(r1, r2)
            if (r1 != 0) goto L6e
        L5c:
            r1 = -954066356(0xffffffffc7221a4c, float:-41498.297)
            r9.y(r1)
            r0 = r0 & 14
            e(r7, r9, r0)
            r0 = r9
            bwk r0 = (defpackage.bwk) r0
            r0.Y()
            goto L8e
        L6e:
            r0 = -954019794(0xffffffffc722d02e, float:-41680.18)
            r9.y(r0)
            aesp r0 = r7.b
            java.lang.String r1 = r7.a
            cga$a r2 = defpackage.cga.e
            java.lang.String r3 = "contact_row_test_prefix_"
            java.lang.String r1 = r3.concat(r1)
            cga r1 = defpackage.dea.a(r2, r1)
            r2 = 0
            defpackage.aetn.P(r0, r1, r9, r2, r2)
            r0 = r9
            bwk r0 = (defpackage.bwk) r0
            r0.Y()
        L8e:
            bzz r9 = r9.e()
            if (r9 == 0) goto La4
            kie r6 = new kie
            r4 = 12
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            bzf r9 = (defpackage.bzf) r9
            r9.d = r6
        La4:
            return
        La5:
            armm r7 = new armm
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lga.d(lhr, lhv, bwj, int):void");
    }

    public static void e(lhr lhrVar, bwj bwjVar, int i) {
        int i2;
        cga c2;
        int i3;
        int i4 = i & 14;
        bwj c3 = bwjVar.c(-849815926);
        if (i4 == 0) {
            if (true != c3.G(lhrVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !c3.L()) {
            c2 = amv.c(cga.e, 1.0f);
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c3, 0);
            int a2 = bwg.a(c3);
            bwk bwkVar = (bwk) c3;
            byx P = bwkVar.P();
            cga b = cfv.b(c3, c2);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c3.A();
            if (bwkVar.y) {
                c3.l(arqgVar);
            } else {
                c3.C();
            }
            caw.b(c3, a, cwl.a.e);
            caw.b(c3, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c3.j(valueOf, arqvVar);
            }
            caw.b(c3, b, cwl.a.c);
            aetn.P(new aesl(lhrVar.c), null, c3, 0, 2);
            aetn.P(lhrVar.b, dea.a(cga.e, "contact_row_test_prefix_".concat(lhrVar.a)), c3, 0, 0);
            c3.p();
        } else {
            c3.v();
        }
        bzz e = c3.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lhrVar, i, 8);
        }
    }

    public static void f(lhn lhnVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-915801987);
        if (i4 == 0) {
            if (true != c2.G(lhnVar)) {
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
            arpi arpiVar = ((qip) c2.g(qjf.a)).a;
            l(lhnVar, (lib) cak.a(lhnVar.a, c2).a(), gei.a(lhnVar.b, arpiVar, c2, 0), (lid) cak.a(lhnVar.c, c2).a(), c2, (i2 & 14) | 520);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lhnVar, i, 7);
        }
    }

    public static Bundle g(llt lltVar) {
        Bundle bundle = new Bundle();
        if (lltVar.b) {
            bundle.putBoolean("render_add_recipient_button", true);
        }
        if (lltVar.c) {
            bundle.putBoolean("delete_empty_conversation_on_back", true);
        }
        if (lltVar.h == 2) {
            bundle.putBoolean("via_start_chat_intent", true);
        } else {
            bundle.putBoolean("via_share_intent", true);
        }
        return bundle;
    }

    public static void h(lkr lkrVar, lkh lkhVar, String str, Class cls, lkh lkhVar2, int i, Exception exc) {
        ((alvg) ((alvg) lkt.a.i()).g(exc).h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl$Companion", "logTransitionException", 268, "NavigationStateMachineImpl.kt")).U(lkrVar.c(), new ahlg(lkrVar.getClass()), lkhVar, new ahlg(lkhVar.getClass()), str, new ahlg(cls), lkhVar2, new ahlg(lkhVar2.getClass()), new ahlc(i));
    }

    public static void i(aehz aehzVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-751004654);
        if (i4 == 0) {
            if (true != c2.G(aehzVar)) {
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
            enm enmVar = (enm) c2.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i5 = rr.a;
            ro a = rr.a(c2);
            if (a != null) {
                bxl.c(aehzVar, new eiw(aehzVar, a.c(), enmVar, 14, (int[]) null), c2);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(aehzVar, i, 12);
        }
    }

    public static void j(ascv ascvVar, bwj bwjVar, int i) {
        bwj c2 = bwjVar.c(-383786493);
        cas a = cak.a(ascvVar, c2);
        afaw afawVar = cj(a).a;
        List list = cj(a).c;
        lix lixVar = cj(a).b;
        c2.y(-2094517696);
        bwk bwkVar = (bwk) c2;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new cit();
            bwkVar.ad(T);
        }
        cit citVar = (cit) T;
        bwkVar.Y();
        i(cj(a).a.b, c2, 0);
        cga.a aVar = cga.e;
        ajw.e eVar = ajw.c;
        int i2 = cfq.a;
        cue a2 = akk.a(eVar, cfq.a.m, c2, 0);
        int a3 = bwg.a(c2);
        byx P = bwkVar.P();
        cga b = cfv.b(c2, aVar);
        int i3 = cwl.a;
        arqg arqgVar = cwl.a.a;
        c2.A();
        if (bwkVar.y) {
            c2.l(arqgVar);
        } else {
            c2.C();
        }
        caw.b(c2, a2, cwl.a.e);
        caw.b(c2, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            bwkVar.ad(valueOf);
            c2.j(valueOf, arqvVar);
        }
        caw.b(c2, b, cwl.a.c);
        adom.bx(afawVar, null, null, citVar, false, c2, 3072, 22);
        c2.y(-801803916);
        if (lixVar.b.isEmpty()) {
            lgc.c(list, false, c2, 8, 2);
        }
        bwkVar.Y();
        lgc.b(lixVar, c2, 0);
        c2.p();
        if (afawVar.a instanceof afar) {
            cj(a);
            k(citVar, c2, 6);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(ascvVar, i, 13);
        }
    }

    public static void k(cit citVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        citVar.getClass();
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1689991980);
        if (i4 == 0) {
            if (true != c2.G(citVar)) {
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
            View view = (View) c2.g(AndroidCompositionLocals_androidKt.f);
            agak agakVar = (agak) c2.g(agas.a);
            bxl.g(citVar, new gci(citVar, agakVar, view, (arpe) null, 15), c2);
            c2.y(-988684931);
            enm enmVar = (enm) c2.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c2.y(-1465762720);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(enf.ON_ANY, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            bxl.c(enmVar, new kjs(enmVar, bynVar, 6, null), c2);
            enf enfVar = (enf) bynVar.a();
            bwkVar.Y();
            bxl.g(enfVar, new icw(enfVar, citVar, agakVar, view, (arpe) null, 4), c2);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(citVar, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(defpackage.lhn r23, defpackage.lib r24, defpackage.gqg r25, defpackage.lid r26, defpackage.bwj r27, int r28) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lga.l(lhn, lib, gqg, lid, bwj, int):void");
    }

    public static void m(afaw afawVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1739715656);
        if (i4 == 0) {
            if (true != c2.G(afawVar)) {
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
            bsd b = ahfn.b(brg.a, c2, 384);
            c2.y(-1395727882);
            c2.y(297922138);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = afrg.o;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            abm c3 = zs.c(brg.a, 400.0f, null, 5);
            aag a = zg.a(c2);
            float f = bsb.a;
            bsc a2 = bsb.a(b, (arqg) T, c3, a, c2, 4608, 0);
            bwkVar.Y();
            adom.bx(afawVar, null, a2, null, false, c2, i2 & 14, 26);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(afawVar, i, 4);
        }
    }

    public static void n(asai asaiVar, bwj bwjVar, int i) {
        cga b;
        cga a;
        cga c2;
        bwj c3 = bwjVar.c(298374602);
        cas b2 = cao.b(asaiVar, null, null, c3, 2);
        if (ck(b2) == null) {
            bzz e = c3.e();
            if (e != null) {
                ((bzf) e).d = new kjt(asaiVar, i, 2);
                return;
            }
            return;
        }
        lfp ck = ck(b2);
        ck.getClass();
        kkc a2 = iaw.a(c3);
        b = amv.b(cga.e, 1.0f);
        a = adf.a(b, cku.g, clw.a);
        c3.y(1191131338);
        bwk bwkVar = (bwk) c3;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = jyp.s;
            bwkVar.ad(T);
        }
        afaw afawVar = ck.a;
        bwkVar.Y();
        c2 = dhb.c(a, false, (arqr) T);
        ahji.y(c2, cdk.e(776571790, new lfw(afawVar, 1), c3), null, null, null, 0, 0L, 0L, null, cdk.e(-117202663, new jjs(ck, 16), c3), c3, 805306416, 508);
        yzc.z(a2, cku.g, false, null, c3, 48, 12);
        bzz e2 = c3.e();
        if (e2 != null) {
            ((bzf) e2).d = new kjt(asaiVar, i, 3);
        }
    }

    public static void o(Intent intent) {
        intent.removeExtra("draft_data");
        if (yhx.b) {
            intent.removeExtra("android.remoteInputDraft");
        }
    }

    public static boolean p(zqe zqeVar) {
        int i = 0;
        if (zqeVar == null) {
            return false;
        }
        try {
            ((ixd) zqeVar).M();
            jar bl = ((ixd) zqeVar).bl(false);
            if (bl != null) {
                int i2 = bl.o;
                if (i2 != 2) {
                    if (i2 == 3) {
                    }
                }
                bl.c();
                return true;
            }
            if (((Boolean) ((ixd) zqeVar).H(new isa(18), new isa(19))).booleanValue()) {
                return true;
            }
            return ((Boolean) ((ixd) zqeVar).G(new isa(20), new ivi(zqeVar, i))).booleanValue();
        } catch (IllegalStateException e) {
            alvw i3 = lex.a.i();
            i3.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i3).g(e).h("com/google/android/apps/messaging/main/MainActivityPeer$Companion", "tryBackPressingOnConversationFragment", 2471, "MainActivityPeer.kt")).q("ConversationFragment threw exception - ignoring");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(Activity activity, boolean z) {
        Object obj;
        activity.getClass();
        if (r(activity)) {
            if (c == null) {
                c = Boolean.valueOf(activity.getSharedPreferences("bugle", 0).getBoolean(activity.getResources().getString(R.string.split_view_pref_key), true));
            }
            Boolean bool = c;
            bool.getClass();
            if (bool.booleanValue() && !z) {
                if (activity instanceof akkh) {
                    obj = ((akkh) activity).E();
                } else {
                    obj = null;
                }
                if ((obj instanceof lex) && !activity.isTaskRoot()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean r(Context context) {
        return context.getResources().getBoolean(R.bool.is_sw600_w600);
    }

    public static lep s(arqr arqrVar) {
        if (yhx.d) {
            return new lfb(arqrVar);
        }
        return new lfa();
    }

    public static agpj t(boolean z) {
        return new agpk("CAST(IFNULL($V, 0) AS INT) = $V", new Object[]{lcz.c.d, Integer.valueOf(cl(z))});
    }

    public static agpj u(boolean z) {
        return new agpk("CAST(IFNULL($V, 0) AS INT) > $V", new Object[]{lcz.c.d, Integer.valueOf(cl(z))});
    }

    public static agpj v(boolean z) {
        return new agpk("CAST(IFNULL($V, 0) AS INT) < $V", new Object[]{lcz.c.d, Integer.valueOf(cl(z))});
    }

    public static /* synthetic */ lcx w(lcx lcxVar, yiy yiyVar, boolean z, xnv xnvVar) {
        if (z) {
            lcxVar.g(new atkn(lcz.c.b, true), new atkn(lcz.c.c, true));
            return lcxVar;
        }
        if (yig.d()) {
            Object obj = lcz.c.b;
            lfl lflVar = lcz.c;
            agmh agmhVar = (agmh) obj;
            wam.H(lcxVar, true, yiyVar, xnvVar, agmhVar, (agmh) lflVar.a, (agmh) lflVar.c, (agmh) lflVar.d);
            return lcxVar;
        }
        lfl lflVar2 = lcz.c;
        lcxVar.g(new atkn(lcz.c.d, true), new atkn(lflVar2.b, true), new atkn(lflVar2.c, true));
        return lcxVar;
    }

    public static /* synthetic */ lcx x(lcx lcxVar, yiy yiyVar, boolean z, xnv xnvVar) {
        if (z) {
            lcxVar.g(new atkn(lcz.c.b, false), new atkn(lcz.c.c, false));
            return lcxVar;
        }
        if (yig.d()) {
            Object obj = lcz.c.b;
            lfl lflVar = lcz.c;
            agmh agmhVar = (agmh) obj;
            wam.H(lcxVar, false, yiyVar, xnvVar, agmhVar, (agmh) lflVar.a, (agmh) lflVar.c, (agmh) lflVar.d);
            return lcxVar;
        }
        lfl lflVar2 = lcz.c;
        lcxVar.g(new atkn(lcz.c.d, false), new atkn(lflVar2.b, false), new atkn(lflVar2.c, false));
        return lcxVar;
    }

    public static /* synthetic */ agpj y(lcq lcqVar, String str, xnv xnvVar) {
        Object obj = lcz.c.b;
        lfl lflVar = lcz.c;
        return new agpl(aglo.n(wam.N((agmh) obj, (agmh) lflVar.a, (agmh) lflVar.c, lcqVar.f, xnvVar)) + str + lcqVar.a);
    }

    public static /* synthetic */ void z() {
        alok alokVar = new alok();
        alokVar.h("conversations.source_type", 8500);
        alokVar.h("conversations.rcs_session_id", 10000);
        alokVar.h("conversations.join_state", 10006);
        alokVar.h("conversations.conv_type", 10007);
        alokVar.h("conversations.IS_ENTERPRISE", 10018);
        alokVar.h("conversations.has_ea2p_bot_recipient", 12001);
        alokVar.h("conversations.participant_display_destination", 15010);
        alokVar.h("conversations.rcs_session_allows_revocation", 48040);
        alokVar.h("conversations.marked_as_unread", 59220);
        alokVar.h("conversations.mms_group_upgrade_status", 60050);
        alokVar.h("messages.sms_error_code", 9000);
        alokVar.h("messages.sms_error_desc_map_name", 9000);
        alokVar.h("lighter_conversations_table.read", 58700);
        alokVar.h("lighter_conversations_table.is_last_message_outgoing", 58810);
        alokVar.h("lighter_conversations_table.conversation_status", 59030);
        alokVar.h("lighter_conversations_table.last_action_timestamp", 59040);
        alokVar.b();
    }

    public final /* synthetic */ void aP(afgk afgkVar, bwj bwjVar) {
        aeke.ck(this, afgkVar, bwjVar, 72);
    }

    public lga(short[] sArr) {
    }

    public lga(arpi arpiVar, lrf lrfVar, armf armfVar) {
        arpiVar.getClass();
        lrfVar.getClass();
        armfVar.getClass();
    }

    public lga(ydc ydcVar) {
        ydcVar.getClass();
    }

    public lga(arpi arpiVar, pyv pyvVar) {
        arpiVar.getClass();
        pyvVar.getClass();
    }

    public lga(lre lreVar) {
        lreVar.getClass();
    }

    public lga(@oqd armf armfVar) {
        armfVar.getClass();
    }

    public lga(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
    }

    public lga(armf armfVar, byte[] bArr) {
        armfVar.getClass();
    }

    public lga(ghw ghwVar) {
        ghwVar.getClass();
    }

    public lga(Context context) {
        context.getString(R.string.theme_setting_dialog_options_light_mode);
        context.getString(R.string.theme_setting_dialog_options_dark_mode);
        context.getString(R.string.theme_setting_dialog_options_system_default_mode);
    }
}
