package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarCollections;
import java.security.InvalidParameterException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abeh extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ abei h;
    final /* synthetic */ ywn i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abeh(abei abeiVar, ywn ywnVar, arpe arpeVar) {
        super(2, arpeVar);
        this.h = abeiVar;
        this.i = ywnVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abeh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        wfh wfhVar;
        Object q;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        arpl arplVar = arpl.a;
        if (this.g != 0) {
            obj6 = this.f;
            Object obj8 = this.e;
            obj4 = this.d;
            obj7 = this.c;
            obj2 = this.b;
            obj3 = this.a;
            try {
                aqil.P(obj);
                obj5 = obj3;
                wfhVar = obj8;
                q = obj;
            } catch (InvalidParameterException e) {
                e = e;
                ((wfh) obj2).q(9);
                alwl alwlVar = (alwl) abei.a.i();
                alwlVar.X(ydl.M, "LoadPagedMessagesHandler");
                ((alwl) alwlVar.g(e)).q("#loadMessages ListMessagesRequest did not contain the expected parameters.");
                obj5 = obj3;
                return ((wfh) obj5).p();
            } catch (Exception e2) {
                e = e2;
                ((wfh) obj2).q(6);
                alwl alwlVar2 = (alwl) abei.a.i();
                alwlVar2.X(ydl.M, "LoadPagedMessagesHandler");
                ((alwl) alwlVar2.g(e)).q("#loadMessages ListMessagesRequest parsing threw an unexpected error.");
                obj5 = obj3;
                return ((wfh) obj5).p();
            }
        } else {
            aqil.P(obj);
            abei abeiVar = this.h;
            ywn ywnVar = this.i;
            wfh bd = aabr.bd(ywp.a.createBuilder());
            try {
                bd.q(3);
                aozy createBuilder = ywo.a.createBuilder();
                createBuilder.getClass();
                wfhVar = new wfh(createBuilder);
                List unmodifiableList = DesugarCollections.unmodifiableList(((ywo) ((aozy) wfhVar.a).b).b);
                unmodifiableList.getClass();
                apdk apdkVar = new apdk(unmodifiableList);
                this.a = bd;
                this.b = bd;
                this.c = wfhVar;
                this.d = bd;
                this.e = wfhVar;
                this.f = apdkVar;
                this.g = 1;
                ConversationIdType b = ruy.b(ywnVar.c);
                MessageIdType b2 = rvc.b(ywnVar.e);
                int i = ywnVar.b;
                int i2 = i & 1;
                if (i2 != 0 && (i & 2) != 0) {
                    abej abejVar = (abej) abeiVar.b.b();
                    int i3 = ywnVar.d;
                    apct apctVar = ywnVar.f;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    q = arro.q(abejVar.e, new rdu(b, i3, b2, abejVar, apds.a(apctVar), (arpe) null, 2), this);
                } else if (i2 == 0 && (i & 2) == 0) {
                    abej abejVar2 = (abej) abeiVar.b.b();
                    q = arro.q(abejVar2.e, new psl(b, ywnVar.d, abejVar2, (arpe) null, 6), this);
                } else {
                    throw new InvalidParameterException("ListMessagesRequest must contain both MessageId and Timestamp, or neither of these values.");
                }
                if (q != arplVar) {
                    obj4 = bd;
                    obj5 = obj4;
                    obj6 = apdkVar;
                    obj2 = obj5;
                    obj7 = wfhVar;
                } else {
                    return arplVar;
                }
            } catch (InvalidParameterException e3) {
                e = e3;
                obj2 = bd;
                obj3 = obj2;
                ((wfh) obj2).q(9);
                alwl alwlVar3 = (alwl) abei.a.i();
                alwlVar3.X(ydl.M, "LoadPagedMessagesHandler");
                ((alwl) alwlVar3.g(e)).q("#loadMessages ListMessagesRequest did not contain the expected parameters.");
                obj5 = obj3;
                return ((wfh) obj5).p();
            } catch (Exception e4) {
                e = e4;
                obj2 = bd;
                obj3 = obj2;
                ((wfh) obj2).q(6);
                alwl alwlVar22 = (alwl) abei.a.i();
                alwlVar22.X(ydl.M, "LoadPagedMessagesHandler");
                ((alwl) alwlVar22.g(e)).q("#loadMessages ListMessagesRequest parsing threw an unexpected error.");
                obj5 = obj3;
                return ((wfh) obj5).p();
            }
        }
        try {
            Iterable iterable = (Iterable) q;
            obj6.getClass();
            iterable.getClass();
            Object obj9 = wfhVar.a;
            if (!((aozy) obj9).b.isMutable()) {
                ((aozy) obj9).u();
            }
            ywo ywoVar = (ywo) ((aozy) obj9).b;
            ywo ywoVar2 = ywo.a;
            apax apaxVar = ywoVar.b;
            if (!apaxVar.c()) {
                ywoVar.b = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(iterable, ywoVar.b);
            apag s = ((aozy) ((wfh) obj7).a).s();
            s.getClass();
            ywo ywoVar3 = (ywo) s;
            Object obj10 = ((wfh) obj4).a;
            if (!((aozy) obj10).b.isMutable()) {
                ((aozy) obj10).u();
            }
            ywp ywpVar = (ywp) ((aozy) obj10).b;
            ywp ywpVar2 = ywp.a;
            ywpVar.c = ywoVar3;
            ywpVar.b = 3;
        } catch (InvalidParameterException e5) {
            e = e5;
            obj3 = obj5;
            ((wfh) obj2).q(9);
            alwl alwlVar32 = (alwl) abei.a.i();
            alwlVar32.X(ydl.M, "LoadPagedMessagesHandler");
            ((alwl) alwlVar32.g(e)).q("#loadMessages ListMessagesRequest did not contain the expected parameters.");
            obj5 = obj3;
            return ((wfh) obj5).p();
        } catch (Exception e6) {
            e = e6;
            obj3 = obj5;
            ((wfh) obj2).q(6);
            alwl alwlVar222 = (alwl) abei.a.i();
            alwlVar222.X(ydl.M, "LoadPagedMessagesHandler");
            ((alwl) alwlVar222.g(e)).q("#loadMessages ListMessagesRequest parsing threw an unexpected error.");
            obj5 = obj3;
            return ((wfh) obj5).p();
        }
        return ((wfh) obj5).p();
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new abeh(this.h, this.i, arpeVar);
    }
}
