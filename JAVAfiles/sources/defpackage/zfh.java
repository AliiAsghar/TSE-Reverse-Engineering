package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfh {
    public final Object a;

    public zfh(Object obj) {
        this.a = obj;
    }

    public static tkl m(int i) {
        Object apply;
        Integer valueOf;
        xyl.h();
        tko b = tkr.b();
        b.w("getCursorForSim");
        int i2 = 8;
        b.c(new qqv(i, i2));
        apply = new aand(i2).apply(tkr.d);
        tkj[] tkjVarArr = {(tkj) apply};
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (((Integer) tkr.b.getOrDefault(tkjVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        b.m(tkjVarArr);
        return (tkl) b.b().n();
    }

    public static Spannable o(Context context) {
        String bs = yyb.bs(context);
        return w(context.getString(R.string.google_tos_chat_features_tooltip_v2, bs), bs, context.getString(R.string.google_tos_chat_features_learn_more_url, yhx.b(context).getLanguage()));
    }

    public static Spannable p(Context context) {
        String bs = yyb.bs(context);
        return w(context.getString(R.string.google_tos_multisim_tooltip_text_v2, bs), bs, context.getString(R.string.learn_more_url, yhx.b(context).getLanguage()));
    }

    public static void r(Context context, View view, Spannable spannable, int i) {
        if (view.getRootView().findViewById(R.id.google_tos_tooltip_popup_window) != null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.google_tos_tooltip_popup_window_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.google_tos_tooltip_text);
        textView.setText(spannable);
        ahnz.s(textView);
        ahnz.t(textView);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(Math.min(context.getResources().getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth), context.getResources().getDisplayMetrics().widthPixels), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(view.getTop() - i, context.getResources().getDimensionPixelSize(R.dimen.tooltip_min_height)), context.getResources().getDisplayMetrics().heightPixels), Integer.MIN_VALUE));
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        PopupWindow popupWindow = new PopupWindow(inflate);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setWidth(measuredWidth);
        popupWindow.setHeight(measuredHeight);
        popupWindow.showAsDropDown(view, (view.getMeasuredWidth() - measuredWidth) / 2, Math.max(-(view.getMeasuredHeight() + measuredHeight + i), -(view.getMeasuredHeight() + ((int) view.getY()))));
    }

    public static final void s(Context context, TextView textView) {
        textView.setOnClickListener(new zoz(context, textView, 18, null));
        Drawable drawable = context.getResources().getDrawable(R.drawable.quantum_gm_ic_info_black_24);
        drawable.setTint(yyb.bw(context, R.attr.colorOnSurfaceVariant));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        eek.n(textView, new aayb(context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    private final void t(aozy aozyVar) {
        maq maqVar = (maq) this.a.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BANNER_EVENT;
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
        ampr amprVar = (ampr) aozyVar.s();
        amprVar.getClass();
        amfrVar2.aN = amprVar;
        amfrVar2.e |= 1073741824;
        maqVar.j(amfqVar);
    }

    private final void u(int i) {
        aozy createBuilder = ampr.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampr amprVar = (ampr) createBuilder.b;
        amprVar.e = 1;
        amprVar.b |= 1;
        aozy createBuilder2 = ampt.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ampt amptVar = (ampt) createBuilder2.b;
        amptVar.c = i - 1;
        amptVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampr amprVar2 = (ampr) createBuilder.b;
        ampt amptVar2 = (ampt) createBuilder2.s();
        amptVar2.getClass();
        amprVar2.d = amptVar2;
        amprVar2.c = 2;
        t(createBuilder);
    }

    private static void v(Context context, View view) {
        ajgi ajgiVar = new ajgi(context);
        ajgiVar.z(view);
        ajgiVar.t(R.string.rbm_verification_dialog_close_button_text_m2, null);
        ajgiVar.create().show();
    }

    private static Spannable w(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int lastIndexOf = str.lastIndexOf(str2);
        spannableStringBuilder.setSpan(new URLSpan(str3), lastIndexOf, str2.length() + lastIndexOf, 17);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    public final Optional a() {
        Optional optional;
        for (zfr zfrVar : zfr.values()) {
            if (((yzc) this.a.get(zfrVar)) != null) {
                optional = Optional.of(Integer.valueOf(R.style.ThemeOverlay_SystemFont));
            } else {
                optional = null;
            }
            if (optional != null) {
                optional.isPresent();
                return optional;
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [apwt, java.lang.Object] */
    public final void b(TextView textView, int i) {
        if (textView != null && !((Optional) this.a.b()).isEmpty()) {
            textView.setTextSize(0, textView.getContext().getResources().getDimension(i) * ((zxq) ((Optional) this.a.b()).get()).a());
        }
    }

    public final void c() {
        u(3);
    }

    public final void d() {
        u(2);
    }

    public final void e(int i) {
        aozy createBuilder = ampr.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampr amprVar = (ampr) createBuilder.b;
        amprVar.e = 1;
        amprVar.b |= 1;
        aozy createBuilder2 = amps.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amps ampsVar = (amps) createBuilder2.b;
        ampsVar.c = i - 1;
        ampsVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampr amprVar2 = (ampr) createBuilder.b;
        amps ampsVar2 = (amps) createBuilder2.s();
        ampsVar2.getClass();
        amprVar2.d = ampsVar2;
        amprVar2.c = 3;
        t(createBuilder);
    }

    public final void f() {
        u(5);
    }

    public final void g() {
        u(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L66
            java.lang.String r1 = r7.height
            if (r1 != 0) goto L8
            goto L66
        L8:
            java.lang.Object r1 = r6.a
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r7 = r7.height
            int r2 = r7.hashCode()
            r3 = -1616240335(0xffffffff9faa2131, float:-7.205271E-20)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L3c
            r3 = -585750279(0xffffffffdd1628f9, float:-6.7626074E17)
            if (r2 == r3) goto L32
            r3 = 1973327466(0x759e966a, float:4.020672E32)
            if (r2 == r3) goto L28
            goto L46
        L28:
            java.lang.String r2 = "SHORT_HEIGHT"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L46
            r7 = r0
            goto L47
        L32:
            java.lang.String r2 = "TALL_HEIGHT"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L46
            r7 = r4
            goto L47
        L3c:
            java.lang.String r2 = "MEDIUM_HEIGHT"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L46
            r7 = r5
            goto L47
        L46:
            r7 = -1
        L47:
            if (r7 == 0) goto L5e
            if (r7 == r5) goto L56
            if (r7 == r4) goto L4e
            goto L66
        L4e:
            r7 = 2131167644(0x7f07099c, float:1.7949567E38)
            int r7 = r1.getDimensionPixelOffset(r7)
            return r7
        L56:
            r7 = 2131167640(0x7f070998, float:1.794956E38)
            int r7 = r1.getDimensionPixelOffset(r7)
            return r7
        L5e:
            r7 = 2131167643(0x7f07099b, float:1.7949565E38)
            int r7 = r1.getDimensionPixelOffset(r7)
            return r7
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfh.h(com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo):int");
    }

    public final int i(int i) {
        return ((xbf) this.a).a(i).a;
    }

    public final String j(int i) {
        String str;
        tkl m = m(i(i));
        try {
            if (m.moveToFirst()) {
                str = m.k();
            } else {
                str = null;
            }
            m.close();
            return str;
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String k(int i, ConversationIdType conversationIdType) {
        String j = j(i);
        if (j == null && !conversationIdType.b()) {
            xyl.h();
            return (String) sni.g(conversationIdType, new aand(9));
        }
        return j;
    }

    public final boolean l(int i) {
        return ((xbf) this.a).a(i).b.getBoolean("allowEditingSmscAddress", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Type inference failed for: r10v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(com.google.android.ims.rcsservice.businessinfo.BusinessInfoData r17, android.content.Context r18, defpackage.ksm r19) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfh.n(com.google.android.ims.rcsservice.businessinfo.BusinessInfoData, android.content.Context, ksm):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void q(Context context, TextView textView) {
        ykb k = ((yjy) this.a.b()).k();
        int d = k.d() + 1;
        textView.setText(context.getResources().getString(R.string.google_tos_multisim_text, Integer.valueOf(d), k.t()));
        s(context, textView);
    }

    public zfh(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public zfh(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfh(armf armfVar, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfh(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfh(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfh(armf armfVar, short[] sArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
