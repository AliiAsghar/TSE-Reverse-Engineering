package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessTopActionView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izh {
    public ParticipantsTable.BindData a;
    public BusinessInfoData b;
    public izk c;
    public izl d;
    public final izf e;
    public final qya f;
    public final ksm g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final izg k;
    public final msk l;
    public final ogl m;
    public final akgh n = new akgh<jxv>() { // from class: izh.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            xzb.g("Bugle", "Failed to load InfoAndOptions data.");
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            int i;
            String string;
            Uri parse;
            jxv jxvVar = (jxv) obj;
            Object obj2 = jxvVar.a;
            izh izhVar = izh.this;
            izhVar.a = (ParticipantsTable.BindData) obj2;
            izhVar.b = (BusinessInfoData) jxvVar.b;
            iyl iylVar = (iyl) izhVar.e.G().e("conversation_settings_base_fragment");
            iylVar.getClass();
            iylVar.E().f = izhVar.b();
            izhVar.o.getClass();
            izhVar.p.getClass();
            izhVar.q.getClass();
            izhVar.r.getClass();
            izhVar.s.getClass();
            cj fe = izhVar.e.fe();
            fe.getClass();
            Resources resources = fe.getResources();
            ParticipantsTable.BindData bindData = izhVar.a;
            if (bindData != null) {
                izhVar.p.setText(((iew) izhVar.j.b()).n(bindData, true));
                i = lru.g(bindData).c;
                izhVar.o.i(izhVar.f.a(bindData));
                izhVar.o.setImportantForAccessibility(4);
            } else {
                i = 3622735;
            }
            BusinessInfoData businessInfoData = izhVar.b;
            if (businessInfoData != null) {
                string = businessInfoData.getDescription();
                if (izhVar.a == null) {
                    izhVar.p.setText(businessInfoData.getName());
                    if (businessInfoData.getColor() != null) {
                        i = Color.parseColor(businessInfoData.getColor());
                    }
                }
                View view = izhVar.e.Q;
                view.getClass();
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.info_and_options_top_actions);
                LayoutInflater from = LayoutInflater.from(fe);
                msh a = izhVar.l.a(businessInfoData.getRbmBotId());
                BusinessInfoProperty primaryPhoneNumber = businessInfoData.getPrimaryPhoneNumber();
                if (primaryPhoneNumber != null) {
                    izhVar.c(izhVar.w.O(a, primaryPhoneNumber.getValue()), i, linearLayout, from);
                }
                BusinessInfoProperty primaryWebsite = businessInfoData.getPrimaryWebsite();
                if (primaryWebsite != null) {
                    izhVar.c(izhVar.u.M(a, primaryWebsite.getValue()), i, linearLayout, from);
                }
                BusinessInfoProperty primaryEmailAddress = businessInfoData.getPrimaryEmailAddress();
                if (primaryEmailAddress != null) {
                    izhVar.c(izhVar.v.N(a, primaryEmailAddress.getValue()), i, linearLayout, from);
                }
                TabLayout tabLayout = izhVar.r;
                tabLayout.f(new aaam(izhVar, 1));
                Resources resources2 = izhVar.e.fe().getResources();
                String string2 = resources2.getString(R.string.info_and_options_activity_info_tab_title);
                String string3 = resources2.getString(R.string.info_and_options_activity_info_tab_content_description);
                String string4 = resources2.getString(R.string.info_and_options_activity_options_tab_title);
                ajmk e = tabLayout.e();
                e.f(string2);
                e.d(string3);
                tabLayout.h(e, true);
                ajmk e2 = tabLayout.e();
                e2.f(string4);
                tabLayout.g(e2);
            } else {
                izhVar.r.setVisibility(8);
                string = resources.getString(R.string.info_and_options_activity_loading_info);
            }
            if (TextUtils.isEmpty(string)) {
                izhVar.q.setVisibility(8);
            } else {
                izhVar.q.setText(string);
            }
            BusinessInfoData businessInfoData2 = izhVar.b;
            ImageView imageView = izhVar.s;
            imageView.setBackgroundColor(i);
            if (businessInfoData2 == null) {
                xzb.c("Bugle", "No business info, setting hero image view to plain color");
                return;
            }
            String heroImageLocalUri = businessInfoData2.getHeroImageLocalUri();
            String heroImageRemoteUrl = businessInfoData2.getHeroImageRemoteUrl();
            if (TextUtils.isEmpty(heroImageLocalUri)) {
                if (!TextUtils.isEmpty(heroImageRemoteUrl) && URLUtil.isValidUrl(heroImageRemoteUrl)) {
                    parse = Uri.parse(heroImageRemoteUrl);
                } else {
                    xzb.n("Bugle", "Business hero image remote url is invalid: ".concat(String.valueOf(heroImageRemoteUrl)));
                    return;
                }
            } else {
                if (!URLUtil.isValidUrl(heroImageLocalUri)) {
                    xzb.n("Bugle", "Business hero image local url is invalid: ".concat(String.valueOf(heroImageLocalUri)));
                    return;
                }
                parse = Uri.parse(heroImageLocalUri);
            }
            if (ydk.v(parse)) {
                imageView.setBackground(null);
                ((aquq) izhVar.i.b()).f(parse).t(imageView);
            } else {
                xzb.n("Bugle", "Can't set business hero image. Its URL is not for a local resource: ".concat(String.valueOf(heroImageRemoteUrl)));
            }
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    };
    public ContactIconView o;
    public TextView p;
    public TextView q;
    public TabLayout r;
    public ImageView s;
    public final aohs t;
    public final znj u;
    public final znj v;
    public final znj w;
    private final lzv x;
    private final armf y;

    public izh(armf armfVar, izf izfVar, qya qyaVar, ksm ksmVar, znj znjVar, znj znjVar2, znj znjVar3, lzv lzvVar, aohs aohsVar, armf armfVar2, armf armfVar3, armf armfVar4, msk mskVar, ogl oglVar, izg izgVar) {
        this.i = armfVar;
        this.e = izfVar;
        this.f = qyaVar;
        this.g = ksmVar;
        this.w = znjVar;
        this.v = znjVar2;
        this.u = znjVar3;
        this.x = lzvVar;
        this.t = aohsVar;
        this.h = armfVar2;
        this.y = armfVar3;
        this.j = armfVar4;
        this.l = mskVar;
        this.k = izgVar;
        this.m = oglVar;
    }

    public final iyq a() {
        iyl iylVar = (iyl) this.e.G().e("conversation_settings_base_fragment");
        iylVar.getClass();
        return iylVar.E().d;
    }

    public final Optional b() {
        return Optional.ofNullable(this.b);
    }

    public final void c(xvd xvdVar, int i, LinearLayout linearLayout, LayoutInflater layoutInflater) {
        if (((xve) this.y.b()).c(xvdVar.e())) {
            BusinessTopActionView businessTopActionView = (BusinessTopActionView) layoutInflater.inflate(R.layout.business_top_action, (ViewGroup) linearLayout, false);
            businessTopActionView.a = xvdVar;
            TextView textView = (TextView) businessTopActionView.findViewById(R.id.business_top_action_text);
            if (textView == null) {
                xyl.c("Can't configure top business action view: view text not found");
            } else {
                yyb yybVar = businessTopActionView.d;
                textView.setTextColor(i);
                Context context = xvdVar.a;
                textView.setText(context.getResources().getString(xvdVar.d()));
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, xvdVar.f(i), (Drawable) null, (Drawable) null);
                Context context2 = xvdVar.a;
                businessTopActionView.setContentDescription(context2.getResources().getString(xvdVar.c()));
            }
            linearLayout.addView(businessTopActionView);
        }
    }

    public final void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.x.y(this.e.fe(), str);
        }
    }

    public final void e(cg cgVar) {
        bd bdVar = new bd(this.e.G());
        bdVar.z(R.id.info_and_options_tab_container, cgVar);
        bdVar.b();
    }
}
