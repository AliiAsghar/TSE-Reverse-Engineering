package defpackage;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpp extends atow {
    public static final atow a = new atpp();

    @Override // defpackage.atow
    public final atox a(Type type, Annotation[] annotationArr, atqq atqqVar) {
        if (atqx.a(type) != Optional.class) {
            return null;
        }
        return new atrd(atqqVar.a(atqx.h(0, (ParameterizedType) type), annotationArr), 1);
    }
}
