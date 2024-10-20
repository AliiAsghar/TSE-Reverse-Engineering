package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atrb extends atow {
    private final aonx a;

    public atrb(aonx aonxVar) {
        this.a = aonxVar;
    }

    @Override // defpackage.atow
    public final atox a(Type type, Annotation[] annotationArr, atqq atqqVar) {
        return new atrd(this.a.a(new aorn(type)), 0);
    }

    @Override // defpackage.atow
    public final atox b(Type type) {
        return new atrc(this.a, this.a.a(new aorn(type)));
    }
}
