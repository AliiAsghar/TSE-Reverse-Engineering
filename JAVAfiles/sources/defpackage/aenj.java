package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenj extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenj(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v36, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v51, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v68, types: [arwe, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        float c;
        int i;
        switch (this.c) {
            case 0:
                ((aeoa) this.a).i.a(this.b);
                return arnb.a;
            case 1:
                if (this.b == aeln.b) {
                    this.a.a();
                }
                return arnb.a;
            case 2:
                aenr aenrVar = (aenr) this.b;
                if (aenrVar.d.g.b && !aenrVar.a()) {
                    ((aeoa) this.a).i.a(aenw.f);
                } else {
                    ((aenr) this.b).d.b.a();
                }
                return arnb.a;
            case 3:
                this.a.a();
                ((aewr) this.b).c.a();
                return arnb.a;
            case 4:
                this.b.a();
                this.a.a();
                return arnb.a;
            case 5:
                Object obj = this.a;
                if (obj != null) {
                    c = ((Float) obj).floatValue();
                } else {
                    c = ((hdr) this.b).c();
                }
                return Float.valueOf(c);
            case 6:
                ((aehz) this.a).j.a();
                this.b.h(Boolean.valueOf(false));
                return arnb.a;
            case 7:
                if (!((aehz) this.a).g.isEmpty()) {
                    this.b.h(Boolean.valueOf(true));
                } else {
                    ((aehz) this.a).j.a();
                }
                return arnb.a;
            case 8:
                if (!((aehz) this.a).g.isEmpty()) {
                    this.b.h(Boolean.valueOf(true));
                } else {
                    ((aehz) this.a).j.a();
                }
                return arnb.a;
            case 9:
                ((aehz) this.b).j.a();
                this.a.a();
                return arnb.a;
            case 10:
                ((aehz) this.b).j.a();
                this.a.a();
                return arnb.a;
            case 11:
                arrn.J(this.a, null, null, new aely((bkm) this.b, (arpe) null, 8), 3);
                return arnb.a;
            case 12:
                ((afhe) this.b).f.a(this.a);
                return arnb.a;
            case 13:
                ((afid) this.a).ag = ((View) this.b).getContext().getContentResolver();
                RecyclerView recyclerView = (RecyclerView) ((View) this.b).findViewById(R.id.camera_gallery_recycler_view);
                afid afidVar = (afid) this.a;
                afidVar.b = recyclerView;
                afidVar.c = ((View) this.b).findViewById(R.id.camera_gallery_fabs_container);
                FloatingActionButton floatingActionButton = (FloatingActionButton) ((View) this.b).findViewById(R.id.camera_gallery_system_gallery_picker_button);
                floatingActionButton.getClass();
                Object obj2 = this.a;
                afid afidVar2 = (afid) obj2;
                if (true != afid.e(afidVar2).c.c) {
                    i = 8;
                } else {
                    i = 0;
                }
                floatingActionButton.setVisibility(i);
                Optional optional = afidVar2.ap;
                if (optional == null) {
                    arro.b("systemPickerFabCreateListener");
                    optional = null;
                }
                Object obj3 = this.a;
                optional.ifPresent(new adoj(new aeys(13), 14));
                floatingActionButton.setOnClickListener(((agai) obj2).bh().a("CameraGalleryScreen.SystemPickerFab#onClick", new acah(obj2, 8)));
                ((afid) obj3).e = floatingActionButton;
                Object obj4 = this.a;
                View findViewById = ((View) this.b).findViewById(R.id.camera_gallery_fullscreen_camera_button);
                Object obj5 = this.a;
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById;
                floatingActionButton2.getClass();
                afgo afgoVar = afid.e((afid) obj5).d;
                floatingActionButton2.setVisibility(8);
                if (floatingActionButton2.getVisibility() == 0) {
                    floatingActionButton2.setOnClickListener(((agai) obj5).bh().a("CameraGalleryScreen.CameraFab#onClick", new acah(obj5, 9)));
                }
                ((afid) obj4).d = floatingActionButton2;
                Object obj6 = this.a;
                arrn.J(((agai) obj6).bo(), null, null, new afic((afid) obj6, (arpe) null, 0), 3);
                afid afidVar3 = (afid) this.a;
                afidVar3.ai = afidVar3.o();
                ((agai) this.a).bs();
                return arnb.a;
            case 14:
                return new asaa(new afjl((afjn) this.a, (afiu) this.b, null));
            default:
                asai b = ((afjn) this.a).b((afiu) this.b);
                int i2 = ascp.a;
                return arrn.T(b, ((afjn) this.a).b, asco.b, arts.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenj(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
