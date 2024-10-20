package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import defpackage.aonx;
import defpackage.aoon;
import defpackage.aorn;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aony {
    private final aonr f;
    private final ArrayDeque g;
    private final int h;
    private final int i;
    private Excluder c = Excluder.a;
    public int b = 1;
    private final Map d = new HashMap();
    public final List a = new ArrayList();
    private final List e = new ArrayList();

    public aony() {
        int i = aonx.g;
        this.f = aonx.a;
        this.h = aonx.e;
        this.i = aonx.f;
        this.g = new ArrayDeque();
    }

    public final aonx a() {
        ArrayList arrayList = new ArrayList(this.a.size() + this.e.size() + 3);
        arrayList.addAll(this.a);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.e);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        boolean z = aorm.a;
        Excluder excluder = this.c;
        int i = this.b;
        HashMap hashMap = new HashMap(this.d);
        new ArrayList(this.a);
        new ArrayList(this.e);
        ArrayList arrayList3 = new ArrayList(this.g);
        return new aonx(excluder, i, hashMap, this.f, arrayList, this.h, this.i, arrayList3);
    }

    public final void b() {
        Excluder clone = this.c.clone();
        clone.d = true;
        this.c = clone;
    }

    public final void c(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof ConversationSuggestionResponseSerializer.AnonymousClass1;
        boolean z3 = false;
        if (!z2 && !(obj instanceof aooc) && !(obj instanceof aonz) && !(obj instanceof aoon)) {
            z = false;
        } else {
            z = true;
        }
        d.s(z);
        if (type != Object.class && !aood.class.isAssignableFrom((Class) type)) {
            if (obj instanceof aonz) {
                this.d.put(type, (aonz) obj);
            }
            if (z2 || (obj instanceof aooc)) {
                aorn aornVar = new aorn(type);
                List list = this.a;
                if (aornVar.b == aornVar.a) {
                    z3 = true;
                }
                list.add(new TreeTypeAdapter.SingleTypeFactory(obj, aornVar, z3));
            }
            if (obj instanceof aoon) {
                final aorn aornVar2 = new aorn(type);
                final aoon aoonVar = (aoon) obj;
                this.a.add(new aooo() { // from class: com.google.gson.internal.bind.TypeAdapters$28
                    @Override // defpackage.aooo
                    public final aoon a(aonx aonxVar, aorn aornVar3) {
                        if (aornVar3.equals(aorn.this)) {
                            return aoonVar;
                        }
                        return null;
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot override built-in adapter for ".concat(type.toString()));
    }
}
