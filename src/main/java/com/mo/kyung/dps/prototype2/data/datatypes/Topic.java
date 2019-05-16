package com.mo.kyung.dps.prototype2.data.datatypes;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Topic {
	private String name;
	private Set<AccountUser> subscribers;
	public Topic() {
		super();
	}
	public Topic(String name) {
		super();
		this.name = name;
		this.subscribers = new TreeSet<AccountUser>();
	}
	public final String getName() {
		return name;
	}
	public boolean addSubscriber(AccountUser subscriber) {
		return this.subscribers.add(subscriber);
	}
	public boolean removeSubscriber(AccountUser subscriber) {
		return this.subscribers.remove(subscriber);
	}
	public Set<AccountUser> getSubscribers() {
		return Collections.unmodifiableSet(subscribers);
	}
}