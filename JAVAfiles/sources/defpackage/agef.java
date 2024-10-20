package defpackage;

import android.content.Context;
import android.util.Base64;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agef extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agef(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [agih, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [agih, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [agih, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [agih, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        aozb aozbVar;
        int i = 0;
        switch (this.b) {
            case 0:
                return new PopupWindow(((agdq) this.a).c);
            case 1:
                return Integer.valueOf(((aged) this.a).b());
            case 2:
                fzi fziVar = ((gcq) this.a).c;
                gdm gdmVar = (gdm) fziVar.f.get();
                if (gdmVar != null) {
                    int a = gdmVar.a() - 1;
                    ArrayList arrayList = new ArrayList();
                    if (a >= 0) {
                        while (true) {
                            arrayList.add(gdmVar.h(i));
                            if (i != a) {
                                i++;
                            }
                        }
                    }
                    return new gaq(gdmVar.e(), gdmVar.d(), arrayList);
                }
                return fziVar.g.b();
            case 3:
                return Integer.valueOf(((Context) this.a).getColor(R.color.compose_contrasting_text_highlight));
            case 4:
                return Integer.valueOf(((Context) this.a).getColor(R.color.compose_contrasting_text_non_highlight));
            case 5:
                return new agfx(((agfy) this.a).a, 2);
            case 6:
                Duration duration = (Duration) ((aghf) this.a).d.e.c();
                if (duration == null) {
                    return aghy.a;
                }
                return duration;
            case 7:
                agiz.l(this.a, false, true, null, 4);
                return arnb.a;
            case 8:
                agiz.l(this.a, false, false, null, 6);
                return arnb.a;
            case 9:
                this.a.b();
                return arnb.a;
            case 10:
                this.a.c();
                return arnb.a;
            case 11:
                return new aiim(((cg) this.a).L());
            case 12:
                ((agiy) this.a).b();
                return arnb.a;
            case 13:
                return new Object[((asai[]) this.a).length];
            case 14:
                return ((aklj) this.a).aL();
            case 15:
                return ((aklj) this.a).P();
            case 16:
                return ((aklj) this.a).Q();
            case 17:
                return aozb.w(Base64.decode((String) this.a, 3));
            case 18:
                return new ConcurrentHashMap(((Map) ((adef) this.a).e.b()).size(), 0.75f, 4);
            case 19:
                akjb akjbVar = (akjb) this.a;
                return Boolean.valueOf(akjbVar.d.contains(akjbVar.n));
            default:
                akif akifVar = (akif) this.a;
                if (akifVar.c == 5) {
                    aozbVar = (aozb) akifVar.d;
                } else {
                    aozbVar = aozb.b;
                }
                aozbVar.getClass();
                return aozbVar;
        }
    }
}
