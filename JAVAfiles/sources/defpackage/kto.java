package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.Toolbar;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.textfield.TextInputLayout;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kto {
    private final aohs A;
    public final Context a;
    public final ktl b;
    public ktd c;
    public AutoCompleteTextView d;
    public TextInputLayout e;
    public LinearLayout f;
    public final yjf i;
    public final armf j;
    public final ksr k;
    public final armf l;
    public final armf m;
    public final ksu o;
    public final armf p;
    public final armf q;
    public AdvancedFeedbackActivity t;
    public final kkg v;
    public final kor w;
    public final yzk x;
    public final aohs y;
    private final ksm z;
    public final List g = new ArrayList();
    public final alwo h = alwo.o("Bugle");
    public amek n = amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_UNKNOWN;
    public Optional r = Optional.empty();
    public int s = 0;
    public final akgh u = new akgh<Optional<Bitmap>>() { // from class: kto.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            ((alwl) ((alwl) ((alwl) kto.this.h.i()).g(th)).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$1", "onError", (char) 132, "AdvancedFeedbackFragmentPeer.java")).q("Failed to fetch screenshot");
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            kto.this.r = (Optional) obj;
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    };

    public kto(Context context, ksm ksmVar, ktl ktlVar, yzk yzkVar, kkg kkgVar, aohs aohsVar, ksu ksuVar, aohs aohsVar2, kor korVar, yjf yjfVar, armf armfVar, ksr ksrVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = context;
        this.z = ksmVar;
        this.b = ktlVar;
        this.x = yzkVar;
        this.v = kkgVar;
        this.A = aohsVar;
        this.o = ksuVar;
        this.y = aohsVar2;
        this.w = korVar;
        this.i = yjfVar;
        this.j = armfVar;
        this.k = ksrVar;
        this.l = armfVar2;
        this.m = armfVar3;
        this.p = armfVar4;
        this.q = armfVar5;
    }

    public final Intent a() {
        cj fe;
        ktl ktlVar = this.b;
        if (ktlVar != null && (fe = ktlVar.fe()) != null) {
            return fe.getIntent();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        String name;
        ArrayList arrayList;
        byte[] bArr = null;
        ksk kskVar = new ksk(null);
        ksu ksuVar = this.o;
        if (ksuVar != null) {
            kskVar.d = ksuVar;
            int i = 11;
            int i2 = 13;
            Stream map = Collection.EL.stream(this.g).filter(new ilu(i)).map(new koa(i2));
            int i3 = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            ((kor) this.p.b()).d(4, Optional.of(this.n), Optional.of(this.c.b()), Optional.of(alogVar), Optional.of(this.o.a));
            this.r.ifPresent(new ktm(kskVar, 3));
            int i4 = 12;
            Collection.EL.stream(this.g).filter(new ilu(i4)).forEach(new ktm(kskVar, 4));
            int i5 = this.s;
            amme b = amme.b(i5);
            if (i5 != 0 && b != null) {
                name = b.name();
            } else {
                name = this.c.b().name();
            }
            if (kskVar.f == null) {
                kskVar.f = new alok();
            }
            kskVar.f.h("IssueTypeName", name);
            String f = f();
            if (f != null) {
                kskVar.h = Optional.of(f);
                ((alwl) ((alwl) this.h.g()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "launchFeedback", 414, "AdvancedFeedbackFragmentPeer.java")).t("Messages automatically detected an error. Advanced feedback complete, launching normal feedback: %s", f);
            }
            int i6 = 0;
            if (e()) {
                cg d = this.t.E().a.a().d(R.id.message_selector_fragment);
                if (d instanceof ktz) {
                    kua E = ((ktz) d).E();
                    arrayList = new ArrayList();
                    for (kuc kucVar : E.f) {
                        ksw kswVar = new ksw();
                        kswVar.c(kucVar.e);
                        kswVar.d(kucVar.f);
                        Collection.EL.stream(kucVar.d).filter(new ilu(i2)).forEach(new ktm(kswVar, 5));
                        Optional of = Optional.of(kswVar.a());
                        of.isPresent();
                        arrayList.add(of.get());
                    }
                } else {
                    arrayList = new ArrayList();
                }
                kss kssVar = (kss) ((AdvancedFeedbackDataView) ((alog) Collection.EL.stream(this.g).filter(new ilu(8)).collect(alls.a)).get(0)).f().get();
                alog alogVar2 = (alog) Collection.EL.stream(arrayList).map(new koa(i4)).collect(alls.a);
                ArrayList arrayList2 = new ArrayList();
                Collection.EL.stream(arrayList).forEach(new ktm(arrayList2, i6));
                kssVar.d = alogVar2;
                kssVar.c = arrayList2;
            }
            ksm ksmVar = this.z;
            alob alobVar = kskVar.a;
            if (alobVar != null) {
                kskVar.b = alobVar.g();
            } else if (kskVar.b == null) {
                kskVar.b = alsx.a;
            }
            if (kskVar.c == null) {
                kskVar.c = alsx.a;
            }
            alok alokVar = kskVar.f;
            if (alokVar != null) {
                kskVar.g = alokVar.b();
            } else if (kskVar.g == null) {
                kskVar.g = altc.a;
            }
            ksu ksuVar2 = kskVar.d;
            if (ksuVar2 != null) {
                acir a = ksmVar.a(new ksl(kskVar.b, kskVar.c, ksuVar2, kskVar.e, kskVar.g, kskVar.h));
                Runnable j = akto.j(new irs(this, alogVar, i, bArr));
                Runnable j2 = akto.j(new irs(this, alogVar, i4, bArr));
                a.s(new kos(j, 2));
                a.r(new ktn(j2, i6));
                AdvancedFeedbackActivity advancedFeedbackActivity = this.t;
                if (advancedFeedbackActivity != null) {
                    advancedFeedbackActivity.finish();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Missing required properties: consentData");
        }
        throw new NullPointerException("Null consentData");
    }

    public final void c(ktd ktdVar) {
        this.e.j(null);
        this.c = ktdVar;
        for (AdvancedFeedbackDataView advancedFeedbackDataView : this.g) {
            alog a = ktdVar.a();
            int size = a.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < size) {
                    Class<?> cls = ((ksq) a.get(i)).getClass();
                    i++;
                    if (cls == advancedFeedbackDataView.j.getClass()) {
                        z = true;
                        break;
                    }
                }
            }
            advancedFeedbackDataView.g.setChecked(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        en j = this.t.j();
        if (j != null) {
            j.setDisplayHomeAsUpEnabled(true);
            j.setDisplayShowCustomEnabled(true);
            j.setDisplayShowTitleEnabled(false);
            j.setCustomView(R.layout.advanced_feedback_toolbar);
            this.A.r((Button) j.getCustomView().findViewById(R.id.advanced_feedback_fragment_next_button), new klx(this, 10));
        }
        Toolbar eZ = this.t.eZ();
        if (eZ != null) {
            eZ.s(new klx(this, 11));
        }
    }

    public final boolean e() {
        Stream filter = Collection.EL.stream(this.g).filter(new ilu(9));
        int i = alog.d;
        if (!((alog) filter.collect(alls.a)).isEmpty()) {
            return true;
        }
        return false;
    }

    public final String f() {
        Intent a = a();
        if (a == null) {
            return null;
        }
        return a.getStringExtra("advanced_feedback_throwable_string_key");
    }
}
