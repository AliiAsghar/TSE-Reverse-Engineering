package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwf extends no {
    public agwg c;
    public int d = -1;
    public final ahjj e;
    private final alog f;
    private final alog g;
    private final LayoutInflater h;
    private final Context i;
    private final agso j;
    private final int k;

    public agwf(Context context, algy algyVar, ahjj ahjjVar, alog alogVar, int i) {
        this.i = context;
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.emoji_categories_icons);
        alob alobVar = new alob();
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            algyVar.a(Integer.valueOf(i2));
            alobVar.h(Integer.valueOf(obtainTypedArray.getResourceId(i2, 0)));
        }
        obtainTypedArray.recycle();
        alsx alsxVar = (alsx) alogVar;
        int i3 = alsxVar.c;
        for (int i4 = 0; i4 < i3; i4++) {
            alobVar.h(Integer.valueOf(((agvk) alogVar.get(i4)).a()));
        }
        this.f = alobVar.g();
        TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(R.array.emoji_categories_content_desc);
        alob alobVar2 = new alob();
        for (int i5 = 0; i5 < obtainTypedArray2.length(); i5++) {
            algyVar.a(Integer.valueOf(i5));
            alobVar2.h(context.getString(obtainTypedArray2.getResourceId(i5, 0)));
        }
        obtainTypedArray2.recycle();
        int i6 = alsxVar.c;
        for (int i7 = 0; i7 < i6; i7++) {
            alobVar2.h(((agvk) alogVar.get(i7)).b());
        }
        this.g = alobVar2.g();
        this.e = ahjjVar;
        this.j = agso.a(context);
        this.k = i;
        this.c = new agwd();
        this.h = LayoutInflater.from(context);
    }

    @Override // defpackage.no
    public final int b() {
        return ((alsx) this.f).c;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        int i2;
        if (1 != this.k) {
            i2 = R.layout.header_icon_text_holder;
        } else {
            i2 = R.layout.header_icon_holder;
        }
        return new agwe(this.h.inflate(i2, viewGroup, false));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void k(oo ooVar) {
        agwe agweVar = (agwe) ooVar;
        agweVar.a.setOnClickListener(null);
        ((ImageView) agweVar.u).setImageDrawable(null);
        ((ImageView) agweVar.u).setContentDescription(null);
        Object obj = agweVar.t;
        if (obj != null) {
            ((TextView) obj).setText((CharSequence) null);
        }
        agweVar.D(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(agwe agweVar, int i) {
        boolean z;
        agweVar.a.setOnClickListener(new abbx(this, i, 2));
        ((ImageView) agweVar.u).setImageDrawable(this.i.getDrawable(((Integer) this.f.get(i)).intValue()));
        agso.e((View) agweVar.u, (CharSequence) this.g.get(i));
        Object obj = agweVar.t;
        if (obj != null) {
            ((TextView) obj).setText((CharSequence) this.g.get(i));
        }
        agwg agwgVar = this.c;
        Object obj2 = agweVar.u;
        View view = agweVar.s;
        boolean z2 = true;
        if (i == this.d) {
            z = true;
        } else {
            z = false;
        }
        agwgVar.a((ImageView) obj2, view, z);
        if (i != this.d) {
            z2 = false;
        }
        this.c.a((ImageView) agweVar.u, agweVar.s, z2);
        if (z2) {
            this.j.c(((ImageView) agweVar.u).getContentDescription());
        }
        agweVar.D(z2);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void z(oo ooVar, int i, List list) {
        agwe agweVar = (agwe) ooVar;
        View findViewById = agweVar.a.findViewById(R.id.emoji_picker_header_underline);
        ImageView imageView = (ImageView) agweVar.a.findViewById(R.id.emoji_picker_header_icon);
        for (Object obj : list) {
            if (obj instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.c.a(imageView, findViewById, booleanValue);
                agweVar.D(booleanValue);
                return;
            }
        }
        g(agweVar, i);
    }
}
