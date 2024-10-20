package defpackage;

import defpackage.aoyi;
import defpackage.aoyj;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aoyi<MessageType extends aoyj<MessageType, BuilderType>, BuilderType extends aoyi<MessageType, BuilderType>> implements apbs {
    public static void i(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size >= i) {
                list.remove(size);
            } else {
                throw new NullPointerException(str);
            }
        }
    }

    @Override // 
    /* renamed from: b */
    public abstract aoyi clone();

    protected abstract aoyi c(aoyj aoyjVar);

    @Override // defpackage.apbs
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aoyi g(byte[] bArr) {
        return l(bArr, bArr.length);
    }

    @Override // defpackage.apbs
    public final /* bridge */ /* synthetic */ apbs e(aozb aozbVar) {
        try {
            aozg l = aozbVar.l();
            j(l);
            l.z(0);
            return this;
        } catch (apba e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    @Override // defpackage.apbs
    public final /* bridge */ /* synthetic */ apbs f(apbt apbtVar) {
        if (getDefaultInstanceForType().getClass().isInstance(apbtVar)) {
            return c((aoyj) apbtVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.apbs
    public final /* bridge */ /* synthetic */ apbs h(byte[] bArr, aozs aozsVar) {
        return m(bArr, bArr.length, aozsVar);
    }

    public final void j(aozg aozgVar) {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        n(aozgVar, aozs.a);
    }

    @Override // defpackage.apbs
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void n(aozg aozgVar, aozs aozsVar) {
        throw null;
    }

    public aoyi l(byte[] bArr, int i) {
        throw null;
    }

    public aoyi m(byte[] bArr, int i, aozs aozsVar) {
        throw null;
    }

    public abstract void n(aozg aozgVar, aozs aozsVar);
}
