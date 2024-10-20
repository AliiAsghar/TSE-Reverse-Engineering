package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import defpackage.aetn;
import defpackage.ahnz;
import defpackage.aiyq;
import defpackage.aiyv;
import defpackage.aiyz;
import defpackage.aiza;
import defpackage.aizd;
import defpackage.aizj;
import defpackage.aizp;
import defpackage.ajat;
import defpackage.ajbm;
import defpackage.ajbo;
import defpackage.ajbp;
import defpackage.ajbr;
import defpackage.apre;
import defpackage.apri;
import defpackage.aprx;
import defpackage.aqql;
import defpackage.cg;
import defpackage.da;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EmbeddedSurveyFragment extends cg implements ajbm {
    private aiyv a;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aiza aizaVar;
        apri apriVar;
        aprx aprxVar;
        ajbp ajbpVar;
        boolean z;
        String str;
        int i;
        aiyq aiyqVar;
        boolean z2;
        Integer num;
        apri apriVar2;
        aiza aizaVar2;
        String str2;
        aprx aprxVar2;
        aiyq aiyqVar2;
        aizd aizdVar;
        Bundle bundle2;
        Bundle bundle3 = this.m;
        if (bundle != null) {
            aizaVar = (aiza) bundle.getParcelable("Answer");
        } else {
            aizaVar = (aiza) bundle3.getParcelable("Answer");
        }
        String string = bundle3.getString("TriggerId");
        byte[] byteArray = bundle3.getByteArray("SurveyPayload");
        if (byteArray != null) {
            apriVar = (apri) aetn.aZ(apri.a, byteArray);
        } else {
            apriVar = null;
        }
        byte[] byteArray2 = bundle3.getByteArray("SurveySession");
        if (byteArray2 != null) {
            aprxVar = (aprx) aetn.aZ(aprx.a, byteArray2);
        } else {
            aprxVar = null;
        }
        if (string != null && apriVar != null && apriVar.g.size() != 0 && aizaVar != null && aprxVar != null) {
            ajbo ajboVar = new ajbo();
            ajboVar.n = (byte) (ajboVar.n | 2);
            ajboVar.a(false);
            ajboVar.b(false);
            ajboVar.d(0);
            ajboVar.c(false);
            ajboVar.m = new Bundle();
            ajboVar.a = apriVar;
            ajboVar.b = aizaVar;
            ajboVar.f = aprxVar;
            ajboVar.e = string;
            if (bundle != null) {
                z2 = bundle.getBoolean("IsSubmitting");
            } else {
                z2 = bundle3.getBoolean("IsSubmitting", false);
            }
            ajboVar.b(z2);
            if (bundle3.containsKey("LogoResId")) {
                ajboVar.d = Integer.valueOf(bundle3.getInt("LogoResId", 0));
            }
            if (bundle3.containsKey("keepNextButtonForLastQuestion")) {
                ajboVar.c(bundle3.getBoolean("keepNextButtonForLastQuestion", false));
            }
            if (bundle != null) {
                num = Integer.valueOf(bundle.getInt("CurrentQuestionIndexForViewPager"));
            } else {
                num = null;
            }
            ajboVar.h = num;
            if (bundle != null) {
                Bundle bundle4 = bundle.getBundle("SingleSelectOrdinalAnswerMappings");
                if (bundle4 == null) {
                    bundle4 = new Bundle();
                }
                ajboVar.m = bundle4;
            }
            aiyq aiyqVar3 = (aiyq) bundle3.getSerializable("SurveyCompletionCode");
            if (aiyqVar3 != null) {
                ajboVar.i = aiyqVar3;
                ajboVar.a(true);
                aizd aizdVar2 = aizd.EMBEDDED;
                if (aizdVar2 != null) {
                    ajboVar.l = aizdVar2;
                    ajboVar.d(bundle3.getInt("StartingQuestionIndex"));
                    if (ajboVar.n == 31 && (apriVar2 = ajboVar.a) != null && (aizaVar2 = ajboVar.b) != null && (str2 = ajboVar.e) != null && (aprxVar2 = ajboVar.f) != null && (aiyqVar2 = ajboVar.i) != null && (aizdVar = ajboVar.l) != null && (bundle2 = ajboVar.m) != null) {
                        ajbpVar = new ajbp(apriVar2, aizaVar2, ajboVar.c, ajboVar.d, str2, aprxVar2, ajboVar.g, ajboVar.h, aiyqVar2, ajboVar.j, ajboVar.k, aizdVar, bundle2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (ajboVar.a == null) {
                            sb.append(" surveyPayload");
                        }
                        if (ajboVar.b == null) {
                            sb.append(" answer");
                        }
                        if ((ajboVar.n & 1) == 0) {
                            sb.append(" isSubmitting");
                        }
                        if ((ajboVar.n & 2) == 0) {
                            sb.append(" ignoreFirstQuestion");
                        }
                        if (ajboVar.e == null) {
                            sb.append(" triggerId");
                        }
                        if (ajboVar.f == null) {
                            sb.append(" surveySession");
                        }
                        if ((ajboVar.n & 4) == 0) {
                            sb.append(" startingQuestionIndex");
                        }
                        if (ajboVar.i == null) {
                            sb.append(" surveyCompletionStyle");
                        }
                        if ((ajboVar.n & 8) == 0) {
                            sb.append(" hideCloseButton");
                        }
                        if ((ajboVar.n & 16) == 0) {
                            sb.append(" keepNextButtonForLastQuestion");
                        }
                        if (ajboVar.l == null) {
                            sb.append(" surveyStyle");
                        }
                        if (ajboVar.m == null) {
                            sb.append(" singleSelectOrdinalAnswerMappings");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                } else {
                    throw new NullPointerException("Null surveyStyle");
                }
            } else {
                throw new NullPointerException("Null surveyCompletionStyle");
            }
        } else {
            ajbpVar = null;
        }
        if (ajbpVar == null) {
            Log.e("EmbeddedSurveyFragment", "Required EXTRAS not found in the intent, bailing out.");
            return null;
        }
        aiyv aiyvVar = new aiyv(layoutInflater, G(), this, ajbpVar);
        this.a = aiyvVar;
        aiyvVar.b.add(this);
        aiyv aiyvVar2 = this.a;
        if (aiyvVar2.j) {
            ajbp ajbpVar2 = aiyvVar2.k;
            if (ajbpVar2.l == aizd.EMBEDDED && ((aiyqVar = ajbpVar2.i) == aiyq.TOAST || aiyqVar == aiyq.SILENT)) {
                aiyvVar2.b(R.id.survey_main_scroll_view).setVisibility(8);
                return this.a.a;
            }
        }
        ajbp ajbpVar3 = aiyvVar2.k;
        if (ajbpVar3.l == aizd.EMBEDDED && ajbpVar3.h == null) {
            z = true;
        } else {
            z = false;
        }
        apre apreVar = aiyvVar2.c.c;
        if (apreVar == null) {
            apreVar = apre.a;
        }
        boolean z3 = apreVar.b;
        aiyz e = aiyvVar2.e();
        if (!z3 || z) {
            ahnz.a.p(e);
        }
        if (aiyvVar2.k.l == aizd.EMBEDDED) {
            FrameLayout frameLayout = (FrameLayout) aiyvVar2.b(R.id.fl_card_container);
            frameLayout.setClipToPadding(false);
            frameLayout.setClipChildren(false);
            frameLayout.setPadding(0, aiyvVar2.a.getResources().getDimensionPixelOffset(R.dimen.card_container_top_padding), 0, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aiyvVar2.h.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.gravity = 8388659;
            aiyvVar2.h.setLayoutParams(layoutParams);
        }
        if (aiyvVar2.k.l != aizd.EMBEDDED) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aiyvVar2.h.getLayoutParams();
            if (aizj.d(aiyvVar2.h.getContext())) {
                layoutParams2.width = -2;
            } else {
                layoutParams2.width = aizj.a(aiyvVar2.h.getContext());
            }
            aiyvVar2.h.setLayoutParams(layoutParams2);
        }
        if (TextUtils.isEmpty(aiyvVar2.f.b)) {
            str = null;
        } else {
            str = aiyvVar2.f.b;
        }
        ImageButton imageButton = (ImageButton) aiyvVar2.b(R.id.survey_close_button);
        imageButton.setImageDrawable(ahnz.S(aiyvVar2.a()));
        imageButton.setOnClickListener(new ajat(aiyvVar2, str, 5, null));
        aiyvVar2.b(R.id.survey_main_scroll_view).setFocusable(false);
        boolean l = aiyvVar2.l();
        aiyvVar2.d.inflate(R.layout.survey_controls, aiyvVar2.i);
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqql.c(aizp.b))) {
            aiyvVar2.j(l);
        } else if (!l) {
            aiyvVar2.j(false);
        }
        ajbp ajbpVar4 = aiyvVar2.k;
        if (ajbpVar4.l == aizd.EMBEDDED) {
            Integer num2 = ajbpVar4.h;
            if (num2 != null && num2.intValue() != 0) {
                aiyvVar2.n();
            } else {
                aiyvVar2.i(str);
            }
        } else {
            apre apreVar2 = aiyvVar2.c.c;
            if (apreVar2 == null) {
                apreVar2 = apre.a;
            }
            if (!apreVar2.b) {
                aiyvVar2.i(str);
            } else {
                aiyvVar2.n();
            }
        }
        ajbp ajbpVar5 = aiyvVar2.k;
        Integer num3 = ajbpVar5.h;
        aiyq aiyqVar4 = ajbpVar5.i;
        da daVar = aiyvVar2.m;
        apri apriVar3 = aiyvVar2.c;
        ajbr ajbrVar = new ajbr(daVar, apriVar3, ajbpVar5.d, false, ahnz.G(false, apriVar3, aiyvVar2.f), aiyqVar4, aiyvVar2.k.g);
        aiyvVar2.e = (SurveyViewPager) aiyvVar2.b(R.id.survey_viewpager);
        SurveyViewPager surveyViewPager = aiyvVar2.e;
        surveyViewPager.m = aiyvVar2.l;
        surveyViewPager.i(ajbrVar);
        aiyvVar2.e.setImportantForAccessibility(2);
        if (num3 != null) {
            aiyvVar2.e.j(num3.intValue());
        }
        if (l) {
            aiyvVar2.k();
        }
        aiyvVar2.i.setVisibility(0);
        aiyvVar2.i.forceLayout();
        if (l) {
            ((MaterialButton) aiyvVar2.b(R.id.survey_next)).setOnClickListener(new ajat(aiyvVar2, str, 6, null));
        }
        for (EmbeddedSurveyFragment embeddedSurveyFragment : aiyvVar2.c()) {
        }
        View b = aiyvVar2.b(R.id.survey_close_button);
        if (true != aiyvVar2.k.j) {
            i = 0;
        } else {
            i = 8;
        }
        b.setVisibility(i);
        SurveyViewPager surveyViewPager2 = aiyvVar2.e;
        if (surveyViewPager2 != null && surveyViewPager2.z()) {
            apre apreVar3 = aiyvVar2.c.c;
            if (apreVar3 == null) {
                apreVar3 = apre.a;
            }
            if (!apreVar3.b) {
                aiyvVar2.m(2);
            }
        }
        return this.a.a;
    }

    @Override // defpackage.ajbj
    public final da a() {
        return G();
    }

    @Override // defpackage.ajbj
    public final boolean aM() {
        return true;
    }

    @Override // defpackage.ajbj
    public final boolean aN() {
        return this.a.l();
    }

    @Override // defpackage.ajad
    public final void aO() {
        this.a.j(false);
    }

    @Override // defpackage.ajbm
    public final /* bridge */ /* synthetic */ Activity d() {
        return super.fe();
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        int i;
        SurveyViewPager surveyViewPager = this.a.e;
        if (surveyViewPager != null) {
            i = surveyViewPager.c;
        } else {
            i = 0;
        }
        bundle.putInt("CurrentQuestionIndexForViewPager", i);
        bundle.putBoolean("IsSubmitting", this.a.j);
        bundle.putParcelable("Answer", this.a.f);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", this.a.g);
    }

    @Override // defpackage.ajbj
    public final void o() {
        ImageButton imageButton = (ImageButton) this.a.b(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    @Override // defpackage.ajad
    public final void p() {
        this.a.g();
    }

    @Override // defpackage.ajae
    public final void q(boolean z, cg cgVar) {
        aiyv aiyvVar = this.a;
        if (!aiyvVar.j && ajbr.m(cgVar) == aiyvVar.e.c && !aiyvVar.k.k) {
            aiyvVar.h(z);
        }
    }

    @Override // defpackage.ajad
    public final void r(boolean z) {
        this.a.h(z);
    }

    @Override // defpackage.ajbj
    public final void e() {
    }
}
