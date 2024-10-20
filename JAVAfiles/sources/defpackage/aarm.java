package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryRecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarm implements zqe {
    public boolean a;
    public aaru b;
    public aasm c;
    public final Context d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final GalleryBrowserActivity j;
    public final cg k;
    public final ajwt l;
    public final armf m;
    public final aary n;
    public final akgh o = new akgh<List<aatc>>() { // from class: aarm.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            xzb.p("Bugle", th, "AccountFullscreenGalleryFragmentPeer: failed to load gallery data.");
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            int size;
            List list = (List) obj;
            aiut.c();
            akhy akhyVar = aarm.this.s;
            if (list == null) {
                List list2 = akhyVar.e;
                if (list2 == null) {
                    size = 0;
                } else {
                    size = list2.size();
                }
                akhyVar.e = null;
                akhyVar.x(0, size);
            } else {
                List list3 = akhyVar.e;
                if (list3 == null) {
                    akhyVar.e = list;
                    akhyVar.w(0, akhyVar.e.size());
                } else {
                    int size2 = list3.size();
                    List list4 = akhyVar.e;
                    akhyVar.e = list;
                    if (size2 > list.size()) {
                        akhyVar.x(list.size(), size2 - list.size());
                    } else if (size2 < list.size()) {
                        akhyVar.w(size2, list.size() - size2);
                    }
                    int min = Math.min(size2, list.size());
                    List list5 = akhyVar.e;
                    akhs akhsVar = akhyVar.d;
                    List subList = list4.subList(0, min);
                    List subList2 = list5.subList(0, min);
                    algj algjVar = akhyVar.c;
                    int min2 = Math.min(subList.size(), subList2.size());
                    for (int i = 0; i < min2; i++) {
                        Object obj2 = subList.get(i);
                        Object obj3 = subList2.get(i);
                        if (!algjVar.d(obj2, obj3)) {
                            akhv akhvVar = (akhv) akhsVar;
                            akhvVar.a.y(i);
                            akhvVar.a.s(i);
                        } else if (!d.F(obj2, obj3)) {
                            ((akhv) akhsVar).a.q(i);
                        }
                    }
                }
            }
            aarm.this.j.L(amqf.LOADED);
        }

        @Override // defpackage.akgh
        public final void b() {
        }
    };
    public final akhz p = new aaro(this);
    public final akhz q = new aarp(this);
    public final akhz r = new aarq(this);
    public final akhy s;
    public aajq t;
    public final zmn u;
    private final armf v;

    public aarm(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, aarl aarlVar, ajwt ajwtVar, armf armfVar7, aary aaryVar) {
        aald aaldVar = new aald(this, 6);
        zms zmsVar = new zms(14);
        albo.U(true, "Equivalence is already set.");
        this.s = new akhy(aaldVar, new algl(zmsVar, algh.a));
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.v = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.k = aarlVar;
        this.l = ajwtVar;
        this.m = armfVar7;
        this.n = aaryVar;
        this.u = new zmn(aarlVar);
        this.j = (GalleryBrowserActivity) aarlVar.fe();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, aatb aatbVar, View.OnClickListener onClickListener) {
        view.setOnClickListener(onClickListener);
        view.setBackgroundResource(R.drawable.compose2o_tile_background);
        ((ImageView) view.findViewById(R.id.gallery_external_item_icon)).setImageResource(aatbVar.b);
        ((TextView) view.findViewById(R.id.gallery_external_item_text)).setText(aatbVar.a);
    }

    public final void a(alhr alhrVar, Bundle bundle) {
        yyz yyzVar = (yyz) this.v.b();
        aart aartVar = new aart(this);
        AttachmentQueueState attachmentQueueState = ((aapj) this.j).C;
        aary aaryVar = this.n;
        this.c = yyzVar.n(this.k, aartVar, attachmentQueueState, null, this.b, null, null, 0, aaryVar.b, alhrVar);
        FullscreenGalleryRecyclerView fullscreenGalleryRecyclerView = (FullscreenGalleryRecyclerView) this.k.L().findViewById(R.id.full_screen_gallery_recycler_view);
        aasm aasmVar = this.c;
        aasmVar.d = fullscreenGalleryRecyclerView;
        aasmVar.m(bundle);
    }

    public final void c() {
        int bw;
        String string;
        int a = ((aapj) this.j).C.a(GalleryContentItem.class);
        if (a > 0) {
            bw = this.j.getColor(R.color.primary_brand_non_icon_color);
        } else {
            bw = yyb.bw(this.j, android.R.attr.colorControlNormal);
        }
        if (a > 0) {
            string = this.j.getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection, a, Integer.valueOf(a));
        } else {
            string = this.j.getResources().getString(R.string.mediapicker_gallery_title);
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(bw), 0, spannableString.length(), 18);
        yzc.o(this.j.j(), spannableString);
        Drawable drawable = this.j.getDrawable(R.drawable.quantum_ic_arrow_back_black_24);
        if (drawable != null) {
            drawable.setTint(bw);
            en j = this.j.j();
            if (j != null) {
                j.setHomeAsUpIndicator(drawable);
            }
        }
    }

    @Override // defpackage.zqe
    public final boolean n() {
        throw null;
    }
}
