package com.vikas.test.mavenaws.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "DEVICE")
public class DeviceEntity extends AbstractTimestampEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * The column <code>public.device.id</code>.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;

	/**
	 * The column <code>public.device.batchid</code>.
	 */
	/*
	 * @Column(name = "batchid", columnDefinition = "CHAR(30)", nullable = true)
	 * private String BATCHID;
	 */

	/**
	 * The column <code>public.device.producttypeid</code>.
	 */
	@Column(name = "batchid", columnDefinition = "VARCHAR(50)", nullable = true)
	private String PRODUCTTYPEID;

	/**
	 * The column <code>public.device.waferid</code>.
	 */
	@Column(name = "waferid", columnDefinition = "VARCHAR(50)", nullable = true)
	private String WAFERID;

	/**
	 * The column <code>public.device.reelid</code>.
	 */
	@Column(name = "reelid", columnDefinition = "VARCHAR(50)", nullable = true)
	private String REELID;

	/**
	 * The column <code>public.device.trayid</code>.
	 */
	@Column(name = "trayid", columnDefinition = "VARCHAR(50)", nullable = true)
	private String TRAYID;

	/**
	 * The column <code>public.device.customerid</code>.
	 */
	@JoinColumn(columnDefinition = "bigint(50)", name = "customer_id", referencedColumnName = "id")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	private Customer CUSTOMERID;

}
